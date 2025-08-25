// Програма проверки слова на соответствие части речи (глагол) наличие окончания ся
import java.util.Scanner;

public class PartOfSpeech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String str = scanner.nextLine();
        String wordType = "";
        if (str.endsWith("ся")) {  // Функция определяющая наличие или окончания
            wordType = "глагол";
        } else if (str.endsWith("ет")) {
            wordType = "глагол";
        } else if (str.endsWith("ют")) {
            wordType = "глагол";
        } else if (str.endsWith("ть")) {
            wordType = "глагол";
        } else if (str.endsWith("аю")) {
            wordType = "глагол";
        } else if (str.endsWith("шь")) {
            wordType = "глагол";
        } else if (str.endsWith("ся")) {
            wordType = "глагол";
        } else if (str.endsWith("ая")) {
            wordType = "прилагательное";
        } else if (str.endsWith("ое")) {
            wordType = "прилагательное";
        } else if (str.endsWith("ый")) {
            wordType = "прилагательное";
        } else if (str.endsWith("ее")) {
            wordType = "прилагательное";
        } else if (str.endsWith("ий")) {
            wordType = "прилагательное";
        } else {
            wordType = "существительное";
        }
        System.out.println("Вы ввели " + wordType);
    }
}
