package rmilab;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.ServiceUnavailableException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) throws NamingException, RemoteException {
        try {
            LocateRegistry.createRegistry(1099);
            new InitialContext().rebind("rmi://localhost:1099/Task", new Task());
            System.out.println("Server has been started successfully");
        } catch (ServiceUnavailableException sue) {
            System.out.println("rmiregistry hasn't been started");
        }
    }

}
