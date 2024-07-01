package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		// with new keyword:
		// when you are not sure about the values
		int i[] = new int[10]; // 0-9

		// array literals: when you are already having the values
		// int array:
		int num[] = { 1, 2, 3, 4, 5, 6 };// 0-5
		System.out.println(num[2]);
		System.out.println(num[5]);
		// System.out.println(num[6]);//AIOB
		System.out.println(num.length);

		System.out.println(num);
		System.out.println(Arrays.toString(num));
		for (int e : num) {
			System.out.println(e);
		}

		System.out.println("---------");

		String stNames[] = { "Sudheer", "RAvi", "Naveen", "Tom" };

		// for loop
		for (int k = 0; k < stNames.length; k++) {
			System.out.println(stNames[k]);
			if (stNames[k].equals("Naveen")) {
				System.out.println("Trainer");
				break;
			}
		}

		System.out.println("---------");

		// for each loop
		for (String e : stNames) {
			System.out.println(e);
			if (e.equals("Naveen")) {
				System.out.println("Trainer");
				break;
			}
		}

		System.out.println("---------");

		Object empInfo[] = { "Neha", 25, 34.55, true, 'f' };

		// for loop
		for (int k = 0; k < empInfo.length; k++) {
			System.out.println(empInfo[k]);
			if (empInfo[k].equals('f')) {
				System.out.println("Female");
				break;
			}
		}

		System.out.println("---------");

		// for each loop
		for (Object e : empInfo) {
			System.out.println(e);
			if (e.equals('f')) {
				System.out.println("Female");
				break;
			}
		}

		System.out.println("---------");

		//
		int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 0-9==>10
		for (int r = number.length - 1; r >= 0; r--) {
			System.out.println(number[r]);// 10
		}

	}

}
