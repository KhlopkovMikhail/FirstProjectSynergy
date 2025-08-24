import java.util.Scanner;

public class MaxNuber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("y: ");
        int y = scanner.nextInt();
        System.out.println("z: ");
        int z = scanner.nextInt();

        if (x > y || x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}

