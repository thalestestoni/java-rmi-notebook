import java.rmi.Naming;

public class RMIClient {
    public static void main (String[] args) {
        String rmiRegistryHostname = "localhost";
        String rmiServiceName = "HelloWorldService";
        String who = "Thales";

        try {
            HelloWorld helloWorld = (HelloWorld) Naming.lookup("rmi://"+rmiRegistryHostname+"/"+rmiServiceName);
            System.out.println(helloWorld.sayHello(who));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
