import java.util.Arrays;

public class Searching {

    // Linear Search(time complexity = O(n))
    public static boolean LinearSearch(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean BinarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return true;
            } else if (key < arr[mid]) {
                return BinarySearch(arr, low, mid - 1, key);
            } else if (key > arr[mid]) {
                return BinarySearch(arr, mid + 1, high, key);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 2, 1 };
        System.out.println(Searching.LinearSearch(arr, 20));

        Arrays.sort(arr);
        System.out.println(Searching.BinarySearch(arr, 0, arr.length - 1, 15));

    }
}
