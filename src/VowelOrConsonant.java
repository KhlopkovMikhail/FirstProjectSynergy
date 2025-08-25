// Программа определения гласная или согласная введена буква
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char o1 = 'а';
        char o2 = 'я';
        char o3 = 'о';
        char o4 = 'ё';
        char o5 = 'э';
        char o6 = 'е';
        char o7 = 'ы';
        char o8 = 'и';
        char o9 = 'у';
        char o10 = 'й';
        char o11 = 'ю';
        System.out.println("Please enter some letter: ");
        char letter = scanner.next().charAt(0);
        if (letter == o1 || letter == o2 || letter == o3 || letter == o4 || letter == o5 || letter == o6 ||
                letter == o7 || letter == o8 || letter == o9 || letter == o10 || letter == o11 )  {
            System.out.println("Вы ввели гласную");
        } else if (letter >= 'а' && letter <= 'я') {
            System.out.println("Вы ввели согласную");
        } else {
            System.out.println("Вы ввели не букву");
        }
    }
}
