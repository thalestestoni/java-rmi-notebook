import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        String serviceName = "CalculatorService";
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            CalculatorImplementation calculator = new CalculatorImplementation();
            Naming.rebind(serviceName, calculator);
            System.out.println("Server is running!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
