
public class SumTwoSmallest {

	public static int func(int[] arr) {
		int a = arr[0];
		int b = arr[1];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] < 0) {
				continue;
			}
			if (a < 0) {
				a = arr[i];
			}
			if (b < 0) {
				b = arr[i];
			}

			if (arr[i] < b) {
				if (arr[i] < a) {
					a = b;
				}
				b = arr[i];
			} else if (arr[i] < a) {
				a = arr[i];
			}

		}
		return a + b;

	}

}
