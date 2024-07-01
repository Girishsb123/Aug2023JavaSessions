package DataConversion;

public class WrapperclassConcept {

	public static void main(String[] args) {
		// String to Int:-

		String s = "100";
		System.out.println(s + 20);// 10020
		int a = Integer.parseInt(s);
		System.out.println(a + 20);// 120

		// String to Double

		String s1 = "100.00";
		double d1 = Double.parseDouble(s1);
		System.out.println(d1 + 20);// 120.00

		// String to boolean
		String s2 = "true";
		boolean b = Boolean.parseBoolean(s2);
		if (b) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}

		// Int to String:-
		int i = 200;
		System.out.println(i + 10);// 210
		String t = String.valueOf(i);
		System.out.println(t + 10);// 20010

		// Boolean to String
		boolean b2 = true;
		String b1 = String.valueOf(b2);
		if (b1.equalsIgnoreCase("true")) {
			System.out.println("bye");
		} else {
			System.out.println("hi");
		}

		String p = "AA100";
		String[] p1 = p.split("AA");
		int r = Integer.parseInt(p1[1]);// NumberFormatException
		System.out.println(r);

		System.out.println(Byte.MAX_VALUE);// 127

		System.out.println(Byte.MIN_VALUE);// -128

		System.out.println(Short.MAX_VALUE);// 3277

		System.out.println(Short.MIN_VALUE);// -3278

		System.out.println(Integer.MAX_VALUE);// 2147483647

		System.out.println(Integer.MIN_VALUE);// -2147483648

		System.out.println(Long.MAX_VALUE);// 9223372036854775807

		System.out.println(Long.MIN_VALUE);// -9223372036854775808

		System.out.println(Float.MAX_VALUE);// 3.4028235E38

		System.out.println(Float.MIN_VALUE);// 1.4E-45

		System.out.println(Character.MAX_VALUE);// ?

		System.out.println(Character.MIN_VALUE);// blank space

		System.out.println(Double.MIN_VALUE);// 4.9E-324   System.out.println(Double.MAX_VALUE);//1.7976931348623157E308

	}

}
