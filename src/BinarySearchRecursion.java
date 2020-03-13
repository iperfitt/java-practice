public class BinarySearchRecursion {

	public static boolean binarySearch(int[] arr, int left, int right, int elem) {
		int middle = 0;
		middle = (left + right) / 2;
		if (left > right) {
			return false;
		}
		if (arr[middle] == elem) {
			return true;
		}
		if (arr[middle] < elem) {
			return binarySearch(arr, middle + 1, right, elem);
		} else if (arr[middle] > elem) {
			return binarySearch(arr, left, middle - 1, elem);
		}
		return false;
	}

}
