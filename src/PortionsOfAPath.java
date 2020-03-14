
public class PortionsOfAPath {

	public static String portions(String portion1, String portion2) {

		char p1char = portion1.charAt(portion1.length() - 1);
		char p2char = portion2.charAt(0);

		if (p1char != '/') {
			if (p2char == '/') {
				return portion1 + portion2;
			} else {
				return portion1 + "/" + portion2;
			}
		}
		// p1char == '/'
		else {
			if (p2char != '/') {
				return portion1 + portion2;
			} else {
				portion1 = portion1.substring(0, portion1.length() - 1);
				return portion1 + portion2;
			}

		}
	}

	public static void main(String[] args) {
		// portions("portion1", "/portion2");
		// portions("portion1", "portion2");
		portions("5wf7fny/", "/stJKXlc8");
		// portions("portion1/", "portion2");

	}

}
