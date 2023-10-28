public class BinaryDSA {
    public static int rank(int key, int[] array) {
        return rank(key, array, 0, array.length - 1);
    }

    public static int rank(int key, int[] array, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < array[mid]) return rank(key, array, lo, mid - 1);
        else if (key > array[mid]) return rank(key, array, mid + 1, hi);
        else return mid;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int keyToFind = 40;

        System.out.println(rank(keyToFind,sortedArray));
    }
}