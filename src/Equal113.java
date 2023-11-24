/**
 * Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 */
public class Equal113 {
    public static void main(String[] args) {
        // Check if there are exactly 3 command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide exactly three integer command-line arguments.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            if (a == b && b == c) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer values as command-line arguments.");
        }
    }
}
