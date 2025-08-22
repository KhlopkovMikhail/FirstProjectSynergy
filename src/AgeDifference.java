import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет вашей маме?");
        int age1 = scanner.nextInt();
        System.out.println("Сколько лет вашему папе?");
        int age2 = scanner.nextInt();
        int difference = Math.abs(age1 - age2);
        int ageMax = Math.max(age1, age2);
        if (difference == 1)
            System.out.println("Их разница в возрасте: " + difference + " год");
        if (difference == 2 || difference == 3 || difference == 4)
            System.out.println("Их разница в возрасте: " + difference + " года");
        if (difference == 5 || difference == 6 || difference == 7 || difference == 8 || difference == 9 || difference == 10)
            System.out.println("Их разница в возрасте: " + difference + " лет");
        System.out.println("Старшему из родителей " + ageMax + " лет");
    }
}
