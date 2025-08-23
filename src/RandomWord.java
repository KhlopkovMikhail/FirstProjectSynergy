// Программа генерации рандомного набора кириллических символов
public class RandomWord {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            double random = Math.random();
            double randomBig = random * 33 + 1072;
            int randomBigFloor = (int) Math.floor(randomBig);
            char letter = (char) randomBigFloor;
            System.out.print(letter);

            x = x + 1;
        }

    }
}
