import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloWorldServer {
    public static void main(String[] args) {
        String serviceName = "HelloWorldService";
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            HelloWorld hello = new HelloWorldImplementation();
            Naming.rebind(serviceName, hello);
            System.out.println("HelloWorld server is running!");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
