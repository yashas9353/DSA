import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    };

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        Main m = new Main();

        int[] arr = new int[10]; // static array

        int[] arr2 = { 8, 9, 4, 5, 6, 7 };

        // Static array Length
        int len = arr.length;
        System.out.println(len);

        // to sort a Static/normal array we use Arrays class
        Arrays.sort(arr); // ascending order

        for (int i : arr) {
            System.out.print(i + " ");
        }

        // desending order (using quick sort)
        m.quickSort(arr2, 0, arr2.length - 1);

        for (int i : arr2) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> arr1 = new ArrayList<>(); // Dynamic Array

        // Adding method
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);

        for (Integer i : arr1) {
            System.out.print(i + " ");
        }

        // get element through index
        arr1.get(0);

        // array size
        arr1.size();

        // remove element by index
        arr1.remove(0);

    }
}