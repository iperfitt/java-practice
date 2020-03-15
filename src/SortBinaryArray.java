//Given a binary array, sort in linear time and constant space. Output should print all 0's followed by ones
public class SortBinaryArray {

	public static int[] sortBinary(int[] arr) {
		int[] sorted = new int[arr.length];
		int oneCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			} else {
				oneCount++;
			}
		}
		for (int j = sorted.length - 1; j >= sorted.length - oneCount; j--) {
			sorted[j] = 1;
		}
		return sorted;
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

		System.out.println(sortBinary(arr));

	}

}
