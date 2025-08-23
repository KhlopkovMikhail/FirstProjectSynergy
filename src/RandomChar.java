public class RandomChar {
    public static void main(String[] args) {
        double random = Math.random();
        double randomBig = random * 33 + 1072; // Рандомная цыфра от 1072 до 1103 (Диапазон кириллицы в UTF)
        int randomBigFloor = (int) Math.floor(randomBig);
        char letter = (char) randomBigFloor;
        System.out.println(letter);
    }
}
