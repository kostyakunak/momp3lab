public class FibonacciCalculator {
    public static int recursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }

    public static int cycleExecute(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
