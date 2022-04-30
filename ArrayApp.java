public class ArrayApp {
	// create an array called arr, add 10 items
	public static int[] arr;
	
	public static void find(int item) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == item) {
				System.out.println("Found item " + item + " at location " + i);
return;
			}
		}	
		System.out.println("Item not found");
	}
 
	public static void printArr() {
		System.out.println("Printing arr: ");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
 
	public static void delete(int item) {
		int i = 0;
		int deleteIndex = -1;
		while (deleteIndex == -1) {
			if (arr[i] == item) {
				deleteIndex = i;
			}
			i++;
		}
 
		// delete and shift
		for (int j=deleteIndex; j<arr.length-1; j++) {
			arr[j] = arr[j+1];
		}
		
		// clear the last item
		arr[arr.length-1] = 0;
	}
 
	public static void main(String[] args) {
		// add 10 items
		arr = new int[10];
 
		arr[0] = 66;
		arr[1] = 49;
		arr[2] = 55;
		arr[3] = 33;
		arr[4] = 62;
		arr[5] = 83;
		arr[6] = 86;
		arr[7] = 63;
		arr[8] = 88;
		arr[9] = 44;
	
		// search for an item
		find(88);
 
		// print all items
		printArr();
 
		// remove 83 and shift all remaining items
		delete(83);
		printArr();
	}
} 

