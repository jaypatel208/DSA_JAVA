/**
 * Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent true and a space to represent false. Include row and column
 * numbers.
 */
public class Two_Dimensional1111 {
    public static void printBooleanArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            //Print row numbers
            System.out.print(i + ": ");

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] ? '*' : ' ');

                System.out.print(" ");
            }
            System.out.println();
        }
        //Print column numbers at bottom
        System.out.println("   ");
        for (int j = 0; j < array[0].length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean[][] exampleArray = {
                {true, false, true, false}, {false, true, false, true}, {true, true, false, false}, {false, false, true, false}
        };
        printBooleanArray(exampleArray);
    }
}
