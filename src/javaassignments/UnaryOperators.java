package javaassignments;

public class UnaryOperators {

	public static void main(String[] args) {

		// 1.
//		int i = 11;
//
//		i = i++ + ++i;
//		//11+13=24
//
//	System.out.println(i);// 24

		// 2.
//		int a = 11, b = 22, c;
//
//		c = a + b + a++ + b++ + ++a + ++b;
//		// 11+22+11+22+12+13+24 = 103
//
//		System.out.println("a=" + a);// 13
//		System.out.println("b=" + b);// 24
//		System.out.println("c=" + c);// 103

		// 3.
//		int i = 0;
//
//		i = i++ - --i + ++i - i--;
		// 0-0+1-1=0

//		System.out.println(i);//0

		// 4.
//		boolean b = true;
//         b++;
//        System.out.println(b);

		// 5.
//		int i=1, j=2, k=3;
//
//		int m = i-- - j-- - k--;
//		//1-2-3=-4
//
//		System.out.println("i="+i);//0
//		System.out.println("j="+j);//1
//		System.out.println("k="+k);//2
//		System.out.println("m="+m);//-4

		// 6.
//		int a = 1, b = 2;
//        
//		System.out.println(--b - ++a + ++b - --a);
		// (1-2+2-1)=0

		// 7.
//		int i = 19, j = 29, k = 0;
//
//		int m = i-- - j-- - k--;
//
//		// m = 19-29-0=-10
//
//		System.out.println("i=" + i);// 18
//		System.out.println("j=" + j);// 28
//		System.out.println("k=" + k);// -1
//		System.out.println("m=" + m);//-10

		// 8.++ -- operators applicable on only variables
//		int i = 11;
//
//		int j = --(i++);

		// 9.
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//		//-1 * -1 * -1 * -1 = 1
//        System.out.println(p);//1
//        System.out.println(m);//-2
//        System.out.println(n);//-2

		// 10.

//		int a=1;
//		
//        a = a++ + ++a * --a - a--; 
//        //1+3*2-2=5
//        System.out.println(a);//5

		// 11.
//		int a = 11++;
//        System.out.println(a);

		// 12.
		int ch = 'A';
		System.out.println(ch++);// 65
		System.out.println((char) ch);// B

		// 13.
		char ch1 = 'A';
		System.out.println(++ch1);// B
		System.out.println((int) ch1);// 66

		// 14.
		double d = 1.5, D = 2.5;
		System.out.println(d++ + ++D);// 5.0
		System.out.println(d);// 2.5
		System.out.println(D);// 3.5

	}

}
