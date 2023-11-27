import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[10]; // statuc array

        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;

        // Static array Length
        int len = arr.length;

        System.out.println(len);

        for (int i : arr) {
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