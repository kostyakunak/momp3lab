public class FactorialCalculator {
    public static int recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }

    public static int cycleExecute(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

