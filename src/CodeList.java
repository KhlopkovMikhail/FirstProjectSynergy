// Код вывода списка символов и их цифровой интерпритации
public class CodeList {
    public static void main(String[] args) {
        int charCode = 0;   // Код вывода списка символов и их цифровой интерпритации
        char value = (char) charCode;

        while (charCode < 200) {
            System.out.println(charCode + " " + value);
            charCode = charCode + 1;
            value = (char) charCode;
        }
    }
}