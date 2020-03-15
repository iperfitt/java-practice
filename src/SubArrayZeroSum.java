import java.util.HashSet;
import java.util.Set;

//https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
//given an arry of integers, check if array contains a sub-array having 0 sum
public class SubArrayZeroSum {

	// O(n)
	public static boolean zeroSum(int[] arr) {

		// create an empty set to store sum of elements of each
		// sub-array A[0..i] where 0 <= i < arr.length
		Set<Integer> set = new HashSet<>();

		// insert 0 into set to handle the case when sub-array with
		// 0 sum starts from index 0
		set.add(0);

		int sum = 0;

		// traverse the given array
		for (int i = 0; i < arr.length; i++) {
			// sum of elements so far
			sum += arr[i];

			// if sum is seen before, we have found a sub-array with 0 sum
			if (set.contains(sum)) {
				return true;
			}

			// insert sum so far into set
			set.add(sum);
		}

		// we reach here when no sub-array with 0 sum exists
		return false;
	}

	public static void main(String[] args) {

		int[] arr = new int[4];
		arr[0] = -4;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 4;

		// System.out.println(zeroSum(arr));
		System.out.println(zeroSum(arr));

	}

}
