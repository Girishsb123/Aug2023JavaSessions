package javaassignments;

public class Test1 {

	public static void main(String[] args) {
		int x = 5, y = 7, z = 0;

		z = (x++ > 5) ? (y++ < 8 ? x++ : y++) : (y++ > 6 ? x-- : y--);

		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);

	}

}
