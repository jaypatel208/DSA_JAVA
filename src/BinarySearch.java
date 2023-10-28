public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int keyToFind = 40;

        int result = binarySearch(sortedArray,keyToFind);
        if (result != -1) {
            System.out.println(keyToFind + " found at index " + result);
        }else {
            System.out.println(keyToFind + " not found in the array");
        }
    }
}