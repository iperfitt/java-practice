public class AmplifyMultiplesOfFour {

	public static int[] ofFour(int num) {
		int[] arr = new int[num];
		for (int i = 1; i < num; i++) {
			if ((i) % 4 == 0) {
				arr[i - 1] = i * 10;
			} else {
				arr[i - 1] = i;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.print(ofFour(8));
	}
}
