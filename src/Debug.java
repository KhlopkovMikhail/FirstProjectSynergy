// Программа нахождения наибольшего числа из трёх
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x:");
        int x = scanner.nextInt();
        System.out.print("Please enter y:");
        int y = scanner.nextInt();
        System.out.print("Please enter z:");
        int z = scanner.nextInt();
        int max = 0;


        if (x >= y) {
            if (z > x) {
                max = z;
            } else {
                max = x;
            }
        }

        if (y <= z) {
            max = z;
        } else {
            max = y;
        }
        System.out.println("Biggest value: " + max);
    }
  }



