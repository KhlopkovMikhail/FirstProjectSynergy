public class Randomizer {
    public static void main(String[] args) {
        double random = Math.random(); // Число от 0 до 1
//        double randomBig = random * 100; // Число от 0 до 100
//        double randomBig = random * 6 + 1; // Число от 1 до 6
        double randomBig = random * 2 + 1; // Число от 1 до 2
        double randomBigFloor = Math.floor(randomBig);
        System.out.println((int) randomBigFloor); // Приведение double в int через (int)
    }
}
