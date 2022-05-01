import java.util.Arrays;

class SelectionSort {
    public static void sort(int[] arr) {
        // start at the beginning
        for (int i = 0; i < arr.length; i++) {
            // find the smallest element
            int smallestIndex = findSmallest(arr, i);
            System.out.println("Smallest index = " + smallestIndex);
            // if smallest is not equal to the current then swap
            if (smallestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
            System.out.println();
            Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        }
    }

    public static int findSmallest(int[] arr, int current) {
        int smallest = current;
        for (int j = current + 1; j < arr.length; j++) {
            System.out.println("comparing " + arr[smallest] + " with " + arr[j]);
            if (arr[smallest] > arr[j]) {
                smallest = j;
            }
        }
        return smallest;
    }
}

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] arr = {66, 59, 36, 14, 45, 2};

        System.out.println();
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        SelectionSort.sort(arr);

        System.out.println();
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}
