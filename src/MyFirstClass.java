public class MyFirstClass {

    public static void main(String[] args) {
        // Решение квадратного уравнения
        // a*x + b*x*x + c = 0
        // 5 - 2 - 3 = 0
        int a = 5;
        int b = -2;
        int c = -3;
        int x;
        int y;
        int D = b*b - 4*a*c;
        // a*x + b*x*x + c
        double x1 = ( -b + Math.sqrt(D)) / (2*a);
        double x2 = ( -b - Math.sqrt(D)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
