import java.util.Scanner;

public class NumberOrChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any symbol: ");
        char letter = scanner.next().charAt(0);
        if (letter > '0' && letter < '9') {
            System.out.println("You entered a number");
        } else {
            if (letter >= 'а' && letter <= 'я') {
                System.out.println("You entered a letter");
            } else {
                if (letter >= 'А' && letter <= 'Я') {
                    System.out.println("You entered a letter");
                } else {
                    if (letter >= 'A' && letter <= 'Z') {
                        System.out.println("You entered a letter");
                    } else {
                        if (letter >= 'a' && letter <= 'z') {
                            System.out.println("You entered a letter");
                        } else {
                            System.out.println("You entered something else. Just character?");
                        }
                    }
                }
            }
        }
    }
}