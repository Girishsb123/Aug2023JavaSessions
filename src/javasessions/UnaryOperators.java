package javasessions;

public class UnaryOperators {

	public static void main(String[] args) {

		// Post increment

		byte a = 1;
		byte b = a++;

		System.out.println(a);// 2
		System.out.println(b);// 1

		// Post decrement

		byte c = 2;
		byte d = c--;

		System.out.println(c);// 1
		System.out.println(d);// 2

		// Pre increment

		byte e = 2;
		byte f = ++e;

		System.out.println(e);// 3
		System.out.println(f);// 3

		// Pre decrement

		byte g = 2;
		byte h = --g;

		System.out.println(g);// 1
		System.out.println(h);// 1
		
		int pop = 1;
		System.out.println(pop++);// 1
		System.out.println(pop);// 2

		int top = 5;
		System.out.println(++top);
		System.out.println(top);
		
		//System.out.println(10.0/3);
		
		System.out.println(10.0 % 3);

	}

}
