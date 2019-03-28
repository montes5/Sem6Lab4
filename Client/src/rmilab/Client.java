package rmilab;

import javax.naming.*;
import javax.servlet.http.HttpServletRequest;

public class Client {

    public String getResult(HttpServletRequest request) {
        String number = request.getParameter("userString");
        try {
            Taskable taskObj = (Taskable) new InitialContext().lookup("rmi://localhost:1099/Task");
            if (!number.equals("")) return taskObj.task(number);
            else return "Введите строку";
        } catch (ServiceUnavailableException sue) {
            return "Не удалось подключиться к серверу";
        } catch (NullPointerException ne) {
            return "Будет здесь";
        } catch (Throwable t) {
            return "Ошибка сервера";
        }
    }

}
