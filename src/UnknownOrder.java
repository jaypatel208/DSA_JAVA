public class UnknownOrder {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > array[mid + 1]) {
                if (array[mid] > key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (array[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ascArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int keyToFind1 = 40;

        int result1 = binarySearch(ascArray, keyToFind1);
        if (result1 != -1) {
            System.out.println(keyToFind1 + " found at index " + result1);
        } else {
            System.out.println(keyToFind1 + " not found in the array");
        }
        int[] desArray = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int keyToFind2 = 50;

        int result2 = binarySearch(desArray, keyToFind2);
        if (result2 != -1) {
            System.out.println(keyToFind2 + " found at index " + result2);
        } else {
            System.out.println(keyToFind2 + " not found in the array");
        }

    }
}