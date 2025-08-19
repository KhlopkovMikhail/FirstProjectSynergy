// Программа проверяющая вводимый символ на тип
import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter char: ");
        char c = scanner.next().charAt(0); // Считать только первый символ строки
        System.out.print(c);
        int charCode = c; // Переменная с цифровым значением символа
        if (charCode >= 48 && charCode <= 57) {
            System.out.println("this is a digit");
        } else {
            System.out.println("this is not a digit");
        }
    }

}

