// Программа проверки числа на чётное или нечётное значение
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // * / + -
        // % остаток от деления
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int x = scanner.nextInt();
        if ((x % 2) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
