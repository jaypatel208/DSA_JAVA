/**
 * Reverse an array in java
 */
public class ReverseArray {
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            //Swap element at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //Moving toward to center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        // Reverse the array
        reverse(myArray);

        // Print reversed array
        System.out.println();
        System.out.println("Reversed array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
