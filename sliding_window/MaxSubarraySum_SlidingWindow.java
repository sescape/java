class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int array[] = {1, 5, 2, 3, 7, 1};
    System.out.println(maxSubarraySum(array, 3));
  }

  static int maxSubarraySum(int array[], int k) {
    int maxSum = 0;
    int len = array.length;

    // length of the array must be greater than
    if (len < k) {
      return -1;
    }
    // compute sum of the first window of size k
    for (int i = 0; i < k; i++) {
      maxSum += array[i];
    }

    // compute the sums of remaining windows
    // by removing the first element of previous window from the sum
    // and by adding last element of the current window
    int currentSum = maxSum;
    for (int i = k; i < len; i++) {
      currentSum += array[i] - array[i - k];
      maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
  }
}