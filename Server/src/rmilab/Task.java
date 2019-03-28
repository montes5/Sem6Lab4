package rmilab;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Task extends UnicastRemoteObject implements Taskable {

    public Task() throws RemoteException {
    }

    public String task(String number) {
        try {
            Double.parseDouble(number);
            return "Сотен " + getDigit(number, 100) + " \nДесятков " + getDigit(number, 10) + " \nЕдиниц " + getDigit(number, 1);
        } catch (NumberFormatException nfe) {
            return "Введите число";
        }
    }

    private String getDigit(String number, int type) {
        return String.format("%.0f", Math.floor(Double.parseDouble(number)/type%10));
    }

}
