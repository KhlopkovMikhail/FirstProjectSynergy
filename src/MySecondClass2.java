// Программа выведения  всех символов из значения переменной
public class MySecondClass2 {
    public static void main(String[] args) {
        String str = "Программисты";
        int x = str.length() -1; // Назначение переменной cо значением индекса колличества символов (12)
        // Чтобы вывести с нулевого символа необходимо указать что вывод будет с - 1 символа
        while (x>=0) {
            System.out.print(str.charAt(x));
            x = x - 1;
        }
    }
}
