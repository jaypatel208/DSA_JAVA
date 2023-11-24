import java.util.Arrays;

/**
 * Write a static method histogram() that takes an array a[] of int values and
 * an integer M as arguments and returns an array of length M whose ith entry is the number
 * of times the integer i appeared in the argument array. If the values in a[] are all
 * between 0 and M–1, the sum of the values in the returned array should be equal to
 * a.length.
 */
public class Histogram1115 {
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];

        for (int value : a) {
            if (value >= 0 && value < M) {
                result[value]++;
            } else {
                System.out.println("Value " + value + " is out of range (0 to M-1). Ignoring.");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 1, 0, 4, 4, 2, 0};
        int M = 5;

        int[] resultArray = histogram(inputArray, M);

        // Print the histogram array
        System.out.println("Histogram Array: " + Arrays.toString(resultArray));
    }
}
