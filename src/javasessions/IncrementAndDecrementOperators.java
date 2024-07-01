package javasessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		int i = 11;
		
		i = i++ + ++i;
		System.out.println(i);//24

		int ch = 'A';
		System.out.println(ch++);//65
		System.out.println(ch);//66
		System.out.println((char)ch);//B
		System.out.println((char)++ch);//C
		
		System.out.println("---------------");

		char ch1 = 'A';
		System.out.println(ch1++);//A
		System.out.println(ch1);//B
		System.out.println(++ch1);//C
		System.out.println((int)ch1);//67
		
		System.out.println("---------------");

		int a = 10, b = 20, c = 0;
		int d = a++ + ++b + a-- + --b + ++c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		
		System.out.println("---------------");

		int m = 0, n = -1;
		int p = m++ + --n + ++m;
		
		System.out.println("m=" + m);//2
		System.out.println("n=" + n);//-2
		System.out.println("p=" + p);//0
		
		System.out.println("---------------");
		
		float d1 = 1.5f , D = 2.5f;
		float d2 = d++ + ++D;
		
		System.out.println("d1=" + d1);//2.5
		System.out.println("d2=" + d2);//5.0	
		System.out.println("D=" + D);//3.5
		
		System.out.println("---------------");
	
		byte i1 = 20 ,j = 30 , k = -10;
		int  l = --i1 + j-- + i1++ + ++k + --j ;
		System.out.println("i1=" + i1);//20
		System.out.println("j=" + j);//28
		System.out.println("k=" + k);//-9
		System.out.println("l=" + l);//87
		
		

	}

}
