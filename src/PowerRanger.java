
public class PowerRanger {

	public static int powerRanger(int n, int a, int b) {

		int count = 0;
		for (int i = 0; i < b; i++) {
			if (Math.pow(i, n) >= a && Math.pow(i, n) <= b) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		powerRanger(1, 1, 5);

	}

}
