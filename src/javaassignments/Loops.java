package javaassignments;

public class Loops {

	public static void main(String[] args) {

		// 1 & 2.I am Batman - 5 times

//		int i = 0;
//		while (i <= 9) {
//			System.out.println("I am Batman");
//			i++;
//
//		}

		// 3.WAP to print 10 to 1 using for, while, do-while loop and for each loop

//		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 0-9 range /li -0/hi/length-1 = 10-1=9/length = hi+1 =
//															// 9+1=10
//
//		// a.Using for loop or index based loop
//
//		for (int i = numbers.length - 1; i >= 0; i--) {
//			System.out.println(numbers[i]);
//		}
//
//		System.out.println("------------");
//
//		// b. Using while loop
//		int i = 10;
//
//		while (i > 0) {
//			System.out.println(i);
//			--i;
//		}
//
//		System.out.println("------------");
//
//		// c.Using do while loop
//
//		int j = 10;
//		do {
//			System.out.println(j);
//			--j;
//		} while (j > 0);

		System.out.println("------------");

		// c.Using for each loop
//		int count = numbers.length - 1;
//		for (int e : numbers) {
//			e = count;
//			System.out.println(numbers[e]);
//			count--;
//		}

		System.out.println("------------");
//
//		//4. Hello word 10 times using while loop
//		int k = 1;
//		while (k <= 10) {
//			System.out.println("Hello World");
//			k++;
//		}

//		System.out.println("------------");

		// Hello word 10 times using while loop
//		int i = 1;
//
//		while(i<=1){
//
//		System.out.println("Hi Java");

//		}

//		System.out.println("------------");

//		5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using 
		// a.for
//		for (int i = 1; i <= 20; i++) {
//			System.out.println(i * 5);
//
//		}
//
//		System.out.println("------------");
//
//		// b.while
//		int i = 1;
//		while (i <= 20) {
//			System.out.println(i * 5);
//			++i;
//		}
//
//		System.out.println("------------");
//
//		// c.do-while loop
//		int n = 1;
//		do {
//			System.out.println(n * 5);
//			++n;
//		} while (n <= 20);
//
//		System.out.println("------------");

		// 6. Print all odd and even numbers between 1 to 100

		// for loop
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Even number : " + i);
//			} else {
//				System.out.println("odd number : " + i);
//			}
//		}
//
//		System.out.println("------------");
//
//		// while loop
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				System.out.println("Even number = " + i);
//			}
//			++i;
//		}

		// Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one using
		// while and for loop.
//		char ch = 'A';
//		while (ch <= 'Z') {
//			System.out.println((ch + "==" + (byte) ch));
//			++ch;
//		}
//
//		System.out.println("------------");
//
//		char ch1 = 'a';
//		while (ch1 <= 'z') {
//			System.out.println((ch1 + "==" + (byte) ch1));
//			++ch1;
//		}
//
//		System.out.println("------------");
//
//		char ch2 = '0';
//		while (ch2 <= '9') {
//			System.out.println((ch2 + "==" + (byte) ch2));
//			++ch2;
//		}

		System.out.println("------------");

		// 9. Print the following series: 
		// a. 1.0 2.0 3.0  ...... 10.0 
		// b. 0 9 18 27 36 …99

//		float f = 1.0f;
//		while (f <= 10.0) {
//			System.out.println(f);
//			++f;
//		}
//
//		System.out.println("------------");
//
//		byte b = 0;
//		while (b <= 11) {
//			System.out.println(b * 9);
//			++b;
//		}

		// 10.Print only vowels (aeiou) using for and while loop. Start the loop from
		// ‘a‘ to ‘z‘.

		for (char c = 'a'; c <= 'z'; c++) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println(c);
			}

		}

		System.out.println("------------");

		char ch1 = 'a';
		while (ch1 <= 'z') {
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				System.out.println(ch1);
			}
			ch1++;
		}

		// 11.Print 1 to 10 and break the loop once you find the multiplication of 7
		// with a message "bye, see you tomorrow".

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}

		}

		System.out.println("----------------");

	}
}
