
public class ReverseOddLength {

	public static String reverseOdd(String str) {

		String[] strArr = str.split("\\s+");
		String rev = "";
		String solution = "";
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() % 2 != 0) {
				for (int j = strArr[i].length() - 1; j >= 0; j--) {
					rev = rev + strArr[i].charAt(j);
				}
				strArr[i] = rev;
				rev = "";
			}

		}
		for (int i = 0; i < strArr.length; i++) {
			if (i + 1 != strArr.length) {
				solution += strArr[i] + " ";
			} else {
				solution += strArr[i];
			}
		}
		return solution;

	}

	public static void main(String[] args) {
		String str = "One two three four";
		System.out.print(reverseOdd(str));
	}
}
