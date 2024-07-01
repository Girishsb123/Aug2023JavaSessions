package StringConcept;

public class StringReverse {

	public static String reverseString(String str) {

		// null check
		if (str == null) {
			System.out.println("String is null can not reverse,pls pass right string");
			return null;
		}

		// Empty check
		if (str.isEmpty()) {
			System.out.println("String is empty,pls pass right string");
			return str;
		}

		// length check
		if (str.length() == 1 || str.length() == 0) {
			return str;
		}

		// Selenium
		int len = str.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

//		String s = reverseString("Selenium");
//		String s = reverseString(null);
		String s = reverseString("");
		System.out.println(s);
	}

}
