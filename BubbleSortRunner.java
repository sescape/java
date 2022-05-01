import java.util.Arrays;

class BubbleSort {
    public static void bubblesort(int[] arr) {
        // start at the beginning
        for (int j = 0; j < arr.length; j++) {
            System.out.println("\ncurrent item: " + arr[j]);
            for (int i = 0; i < arr.length - j - 1; i++) {
                // compare first two elements and swap if out of order
                System.out.println("comparing " + arr[i] + " with " + arr[i + 1]);
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                // then go to the next pair
            }
            Arrays.stream(arr).forEach(e -> System.out.print(e + " - "));
        }
    }
}

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] arr = {66, 36, 10, 5, 48, 50};

        BubbleSort.bubblesort(arr);

        //Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
