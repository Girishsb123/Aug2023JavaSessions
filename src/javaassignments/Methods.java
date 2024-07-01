package javaassignments;

public class Methods {

	// addition/subtraction/division/multiplication
	public int add(int a, int b) {

		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {

		int c = a - b;
		return c;
	}

	public int div(int a, int b) {

		int c = a / b;
		return c;
	}

	public int mul(int a, int b) {

		int c = a * b;
		return c;
	}

	// product of two double numbers entered by user.
	public double mul(double a, double b) {

		double c = a * b;
		return c;
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		int i = m.add(10, 20);
		System.out.println(i + 20 - 10);

		int j = m.sub(40, 20);
		System.out.println(j);

		int k = m.div(10, 5);
		System.out.println(k);

		int l = m.mul(10, 2);
		System.out.println(l);

		double m1 = m.mul(3.0, 2.0);
		System.out.println(m1);

	}

}
