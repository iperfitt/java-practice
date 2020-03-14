
public class OddishEvenish {

	public static int additivePersistance(int num) {
		String str = Integer.toString(num);
		int total = 0;
		int count = 0;
		while (str.length() != 1) {
			for (int i = 0; i < str.length(); i++) {
				total = total + Character.getNumericValue(str.charAt(i));
				str = Integer.toString(total);
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		additivePersistance(4433);

	}
}
