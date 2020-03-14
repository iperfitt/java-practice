//taken from https://www.techiedelight.com/find-pair-with-given-sum-array/
//Given an unsorted array of integers, find a pair with given sum in it
public class PairWithGivenSum {

	public static String pair(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					return "Pair found at index " + i + " and index " + j;
				}
			}
		}
		return "Pair not found";

	}

	public static void main(String[] args) {
		int[] arr = new int[11];
		arr[0] = 10;
		arr[1] = 7;
		arr[2] = 2;
		arr[3] = 8;
		arr[4] = 4;
		arr[5] = 5;
		arr[6] = 6;
		arr[7] = 1;
		arr[8] = 3;
		arr[9] = 9;
		arr[10] = 0;

		pair(arr, 13);
	}

}
