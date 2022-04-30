public class BinarySearchRunner {
    public static void main(String[] args) {
        System.out.println("===== Executing Binary Search =====");

        int[] arr = {2, 5, 6, 10, 15, 26, 35};

        int location = BinarySearch.find(arr, 0, arr.length-1, 26);
        if (location == -1) {
            System.out.println("Item not found");
            return;
        }
        System.out.println("Found item at location: " + location);
    }
}

class BinarySearch {
    public static int find(int[] arr, int start, int end, int item) {
        // divide into half
        int middle = (start + end) / 2;

        // base case
        if (arr[middle] == item) {
            return middle;
        }

        // if item is less than the middle, search in first half
        if (item < arr[middle]) {
            return find(arr, start, middle, item);
        }

        // if item is greater than the middle, search in second half
        if (item > arr[middle]) {
            return find(arr, middle, end, item);
        }
        // item not found
        return -1;
    }
}

