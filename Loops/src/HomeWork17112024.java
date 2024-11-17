
public class HomeWork17112024 {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }

        int x = 0, y = 1, z;
        for (int i = 2; i <= a; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
}
