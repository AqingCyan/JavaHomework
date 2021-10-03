package code08;

public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = 1 < 2;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a || b);

        System.out.println(a || (10 / 0 > 1));
        System.out.println(a | (10 / 0 > 1)); // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
