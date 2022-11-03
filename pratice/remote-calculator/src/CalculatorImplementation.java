import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplementation extends UnicastRemoteObject implements Calculator {
    protected CalculatorImplementation() throws RemoteException {
    }

    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}
