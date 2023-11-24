/**
 * Print 1 to 100 without using any for loop
 */
public class PrintSagar {
    private static void printDigits(int n) {
        if (n <= 100) {
            System.out.println(n);
            printDigits(n + 1);
        }
    }

    public static void main(String[] args) {
        printDigits(1);
    }
}
