/**
 * Write a code fragment that prints true if the double variables x and y are both
 * strictly between 0 and 1 and false otherwise.
 */
public class Between0and1115 {
    public static void main(String[] args) {
        // Check if there are exactly 2 command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide exactly three integer command-line arguments.");
            return;
        }

        try {
            double X = Double.parseDouble(args[0]);
            double Y = Double.parseDouble(args[1]);

            System.out.println(X < 1.0 && X > 0.0 && Y < 1.0 && Y > 0.0);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer values as command-line arguments.");
        }
    }
}
