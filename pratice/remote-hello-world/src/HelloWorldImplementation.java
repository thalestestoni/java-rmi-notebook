import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImplementation extends UnicastRemoteObject implements HelloWorld {
    protected HelloWorldImplementation() throws RemoteException {
    }

    @Override
    public String sayHello(String who) throws RemoteException {
        return "Hello "+who+" :)";
    }
}
