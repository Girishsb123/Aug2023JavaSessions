package javaassignments;

public class Car {

//	make (String)
//  model (String)
//  year (int)

	String make;
	String model;
	int year;

	public Car() {
		System.out.println("default const...");
	}

	public Car(String make, String model, int year) {

		this.make = make;
		this.model = model;
		this.year = year;
	}

}
