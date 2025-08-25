// Программа проверки количества слов (одно или несколько)
import java.util.Scanner;

public class NumbersOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String str = scanner.nextLine();
        if (str.contains(" ")) {  // Функция определяющая наличие или отсутствие символов в строке
            System.out.println("You entered multiple words");
        } else {
            System.out.println("You entered one word ");
        }
    }
}

