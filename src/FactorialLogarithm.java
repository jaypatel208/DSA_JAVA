/**
 * Write a recursive static method that computes the value of ln (N !)
 */
public class FactorialLogarithm {
    public static double lnFactorial(int N) {
        if (N <= 1) {
            return 0;
        } else {
            return Math.log(N) + lnFactorial(N - 1);
        }
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Log of "+ N + " is: " + lnFactorial(N));
    }
}
