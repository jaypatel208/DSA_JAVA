/**
 * Write a code fragment to print the transposition (rows and columns changed)
 * of a two-dimensional array with M rows and N columns.
 */
public class Transposition113 {
    public static void printTranspose(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        // create new array to store the transposition
        int[][] transposedArray = new int[columns][rows];

        // fill the transposed array with values from the original array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        // print the transposed array
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // create 3x4 two-dimensional array
        int[][] exampleArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Original Array:");

        for (int[] row :exampleArray){
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Print the transposed array
        System.out.println("\nTransposed Array:");
        printTranspose(exampleArray);
    }
}
