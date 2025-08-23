import java.util.Scanner;

public class IntCharScanner {
    public static void main(String[] args) {
//        char letter = 'а';
//        int letterCode = letter; // Присвоение переменной типа int цифрового значения буквы в кодировке UTF
//        System.out.println(letterCode);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char code from 1072 to 1103: ");
        int letterCode = scanner.nextInt();
        char letter = (char) letterCode;
        System.out.println("This wiil be: ");
        System.out.println(letter);
    }
}
