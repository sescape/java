public class RecursiveSum {
	public static void main(String[] args){
		int[] arr = {2, 4, 6};
		
		int sum = sum(arr, 0);
 
		System.out.println(sum);
	}
 
	public static int sum(int[] arr, int curr) {
		if (curr == arr.length) {
			return 0;
		}
		return arr[curr] + sum(arr, curr+1);
	}
}									

