public class Sorting {

    // Quick Sort Time Complexity worst case - O(n^2) average case = O(nlogn)
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
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

    // MergeSort Time Complexity worst case - O(nlogn) average case = O(nlogn)
    public void divide(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conquor(arr, low, high, mid);
    }

    public static void conquor(int[] arr, int low, int high, int mid) {
        int[] new_arr = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2]) {
                new_arr[x++] = arr[idx1++];
            } else {
                new_arr[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            new_arr[x++] = arr[idx1++];
        }
        while (idx2 <= high) {
            new_arr[x++] = arr[idx2++];
        }
        for (int i = 0, j = low; i < new_arr.length; i++, j++) {
            arr[j] = new_arr[i];
        }
    }

    // Ascending Order
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        Sorting s = new Sorting();
        int[] arr = { 8, 5, 4, 3, 7, 1 };
        s.divide(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
