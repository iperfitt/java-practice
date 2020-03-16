import java.util.HashSet;

public class DuplicateElementInLImitedArray {

	// O(n)
	// Space complexity factors with n
	public static int duplicateElement(int[] arr) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i])) {
				return arr[i];
			}
			hs.add(arr[i]);

		}
		return -1;
	}

	// helper function to calculate the factorial
	public static int factorial(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// O(n)
	// Space complexity is constant
	public static int duplicateElement2(int[] arr) {

		int fac = factorial(arr.length - 1);
		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}

		return product / fac;

	}

	public static int duplicateElement3(int[] A) {
		int duplicate = -1;
		// do for each element in the array
		for (int i = 0; i < A.length; i++) {
			// get value of the current element
			int val = (A[i] < 0) ? -A[i] : A[i];

			// make element at index (val-1) negative if it is positive
			if (A[val - 1] >= 0) {
				A[val - 1] = -A[val - 1];
			} else {
				// if element is already negative, it is repeated
				duplicate = val;
				break;
			}
		}
		// restore original array before returning
		for (int i = 0; i < A.length; i++) {
			// make negative elements positive
			if (A[i] < 0) {
				A[i] = -A[i];
			}
		}
		// return duplicate element
		return duplicate;
	}

	public static int duplicateElement4(int[] A) {
		int xor = 0;

		// take xor of all array elements
		for (int i = 0; i < A.length; i++) {
			xor ^= A[i];
		}

		// take xor of numbers from 1 to n-1
		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}

		// same elements will cancel out each other as a ^ a = 0,
		// 0 ^ 0 = 0 and a ^ 0 = a

		// xor will contain the missing number
		return xor;
	}

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 4;

		// System.out.println(duplicateElement(arr));
		// System.out.println(duplicateElement2(arr));
		// System.out.println(duplicateElement3(arr));
		System.out.println(duplicateElement4(arr));

	}

}
