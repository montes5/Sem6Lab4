package rmilab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Taskable extends Remote {
    String task(String number) throws RemoteException;
}
