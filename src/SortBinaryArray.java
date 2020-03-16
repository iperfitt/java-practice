import java.util.HashMap;

//Given a binary array, sort in linear time and constant space. Output should print all 0's followed by ones
public class SortBinaryArray {

	// O(n)
	public static int[] sortBinary(int[] arr) {
		int[] sorted = new int[arr.length];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 0);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				hm.replace(1, hm.get(1) + 1);
			}
		}
		for (int i = arr.length - 1; i >= sorted.length - hm.get(1); i--) {
			sorted[i] = 1;
		}
		return sorted;
	}

	// Utility function to swap elements at two indices in the given array
	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static int[] sortBinary2(int[] A) {
		int pivot = 1;
		int j = 0;

		// each time we encounter a 0, j is incremented and
		// 0 is placed before the pivot
		for (int i = 0; i < A.length; i++) {
			if (A[i] < pivot) {
				swap(A, i, j);
				j++;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 0;
		arr[3] = 0;
		arr[4] = 1;
		arr[5] = 0;
		arr[6] = 1;
		arr[7] = 1;
		arr[8] = 0;
		arr[9] = 1;

		System.out.println(sortBinary2(arr));

	}

}
