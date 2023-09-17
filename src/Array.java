import java.util.Arrays;

public class Array {

    public static void findMaxOfArray() {
        int[] a = {15, 29, 38, 14, 56, 6, 7};
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in array is: " + max);
    }

    public static void averageOfArray() {
        int[] a = {15, 29, 38, 14, 56, 6, 7};
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        double average = sum / N;

        System.out.println("Average of given array is: " + average);
    }

    public static void copyToAnotherArray() {
        int[] a = {15, 29, 38, 14, 56, 6, 7};
        int N = a.length;
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(b));
    }

    public static void reverseTheArray() {
        int[] a = {15, 29, 38, 14, 56, 6, 7};
        int N = a.length;

        for (int i = 0; i < N / 2; i++) {
            int temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }

        System.out.println("Reversed elements of an array is: " + Arrays.toString(a));
    }

    public static void matrixMatrixMultiplication() {
        int[][] a = {{15, 29, 38}, {14, 56, 6}};
        int[][] b = {{7, 6, 56}, {14, 38, 29}};

        int N = a.length;

        int[][] c = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print2DArray(c);
    }

    public static void print2DArray(int[][] array) {
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        findMaxOfArray();
        averageOfArray();
        copyToAnotherArray();
        reverseTheArray();
        matrixMatrixMultiplication();
    }
}
