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
        if (operator == '^') { // Возведение в степень ( 2 в третьей степени (2 * 2 * 2)
            System.out.println(Math.pow(x , y));
        }

    }
}
