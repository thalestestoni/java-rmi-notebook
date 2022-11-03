import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    double sum(double number1, double number2) throws RemoteException;
    double subtract(double number1, double number2) throws RemoteException;
    double multiply(double number1, double number2) throws RemoteException;
    double divide(double number1, double number2) throws RemoteException;
}
