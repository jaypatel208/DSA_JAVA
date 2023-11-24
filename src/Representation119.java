/**
 * Write a code fragment that puts the binary representation of a positive integer N
 * into a String s.
 */
public class Representation119 {
    public static void main(String[] args) {
        int N = 15;
        String binaryRepresentation = getBinaryRepresentation(N);
        System.out.println("Binary representation of " + N + " is: " + binaryRepresentation);
    }

    private static String getBinaryRepresentation(int N) {
        if (N == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (N > 0) {
            int remainder = N % 2;
            binary.insert(0, remainder);
            N = N / 2;
        }

        return binary.toString();
    }
}
