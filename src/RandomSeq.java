import java.util.Random;

public class RandomSeq {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length < 3) {
            System.out.println("Usage: java RandomSeq <N> <lo> <hi>");
            return;
        }

        // Parse command line arguments
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        // Create an instance of the Random class
        Random random = new Random();

        // Print N random values in (lo, hi)
        for (int i = 0; i < N; i++) {
            double x = lo + (hi - lo) * random.nextDouble();
            System.out.printf("%.2f\n", x);
        }
    }
}
