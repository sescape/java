class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int array[] = {1, 5, 2, 3, 7, 1};
    System.out.println(maxSubarraySum(array, 3));
  }

  static int maxSubarraySum(int array[], int k) {
    // maxsum
    int maxSum = 0;
    // length of the input array
    int len = array.length;

    // lenght of array must not be less than window size k
    if (len < k) {
      System.out.println("Invalid");
      return -1;
    }

    // loop through the whole array
    for (int i = 0; i < len - k; i++) {
      // calculate sum of each sub array
      int currentSum= 0;
      for (int j = 0; j < k; j++) {
        currentSum = currentSum + array[i + j];
      }
      // compare and update max sum if needed
      maxSum = Math.max(currentSum, maxSum);
    }
    // return max sum
    return maxSum;
  }
}