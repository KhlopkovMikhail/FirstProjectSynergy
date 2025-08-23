public class CyrillicUTF {
    public static void main(String[] args) {
        double random = Math.random();
        double randomBig = random * 1103 + 1072; // Диапазон кириллицы в UTF (1072 = А, 1103 = Я)
        int randomBigFloor = (int) Math.floor(randomBig);

        int letterCode = 1072;
        while (letterCode <= 1103) {
            char letter = (char)letterCode;
            System.out.println(letter);
            letterCode++;
        }

    }
}
