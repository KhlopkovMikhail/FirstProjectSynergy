import java.util.Scanner;

public class Credit {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter credit sum: ");
        int creditSum = myScan.nextInt();
        System.out.println("Please enter percent: ");
        double percent = myScan.nextDouble();
        System.out.println(creditSum + creditSum * (percent / 100 ));
    }
}
