package javaassignments;

public class Rectangle {

	// class var
	double lenght;
	double width;

	public Rectangle() {
		System.out.println("default const...");
	}

	public Rectangle(double lenght, double width) {
		System.out.println("2 param const...");
		this.lenght = lenght;
		this.width = width;
	}

	public double calculateArea(double lenght, double width) {

		double area = lenght * width;

		return area;

	}

}
