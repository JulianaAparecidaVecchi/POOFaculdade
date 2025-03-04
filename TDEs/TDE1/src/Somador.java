import java.util.Scanner;
public class Somador {
    public static void main(String[] args){
        System.out.println("----| Forneça dois números para a soma! |----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double numberOne = scanner.nextDouble();
        String butter = scanner.nextLine();
        System.out.print("Informe o segundo número: ");
        double numberTwo = scanner.nextDouble();
        double sum = numberOne + numberTwo;
        System.out.printf("O resultado da soma é: %.2f + %.2f = %.2f",numberOne, numberTwo, sum);
    }
}
