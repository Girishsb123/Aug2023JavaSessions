package javaassignments;

public class Testcar {

	public static void main(String[] args) {

		Car c1 = new Car();

		Car c2 = new Car("AUDI", "A7", 2022);
		System.out.println(c2.make + " " + c2.model + " " + c2.year);

	}

}
