package calculadora;

import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        String rmiRegistryHostname = "localhost";
        String rmiServiceName = "CalculatorService";
        Scanner scanner = new Scanner(System.in);
        int number1, number2, operation;

        try {
            Calculator calculator = (Calculator) Naming.lookup("rmi://"+rmiRegistryHostname+"/"+rmiServiceName);

            while (true) {
                System.out.println("--------- OPERAÇÕES MATEMÁTICAS ---------");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("");
                System.out.print("Digite o número correspondente a operação desejada: ");
                operation = scanner.nextInt();

                System.out.print("Informe o primeiro número da operação: ");
                number1 = scanner.nextInt();

                System.out.print("Informe o segundo número da operação");
                number2 = scanner.nextInt();


                switch (operation) {
                    case 1:
                        System.out.println("Resultado: " + calculator.sum(number1, number2));;
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculator.subtract(number1, number2));;
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculator.multiply(number1, number2));;
                        break;
                    case 4:
                        System.out.println("Resultado: " + calculator.divide(number1, number2));;
                        break;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
