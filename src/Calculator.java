import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Please enter math expression: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double y = scanner.nextDouble();

        System.out.println("=");
        if (operator == '+') {
            System.out.println(x + y);
        }
        if (operator == '*') {
            System.out.println(x * y);
        }
        if (operator == '/') {
            System.out.println(x / y);
        }

    }
}
