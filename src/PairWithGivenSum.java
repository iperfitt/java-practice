import java.util.Arrays;
import java.util.HashMap;

//taken from https://www.techiedelight.com/find-pair-with-given-sum-array/
//Given an unsorted array of integers, find a pair with given sum in it
public class PairWithGivenSum {

	// O(n^2)
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

	// O(nlog(n))
	public static String pair2(int[] arr, int sum) {

		Arrays.parallelSort(arr);
		int a = 0;
		int b = arr.length - 1;
		while (arr[a] + arr[b] != sum) {
			if (arr[a] + arr[b] > sum) {
				b--;
			}
			if (arr[a] + arr[b] < sum) {
				a++;
			}
			if (a == b) {
				return "Pair not found";
			}
		}
		return "Pair found";
	}

	// O(n)
	public static String pair3(int[] arr, int sum) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				return "Pair found at index " + i + " and index " + hm.get(arr[i]);
			}
			hm.put(sum - arr[i], i);
		}
		return "Pair not found";
	}

	//

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

		// pair(arr, 13);
		// System.out.println(pair2(arr, 1));
		System.out.println(pair3(arr, 10));
	}

}
