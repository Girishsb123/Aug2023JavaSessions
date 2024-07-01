package javaassignments;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		System.out.println(r.lenght + " " + r.width);

		Rectangle r1 = new Rectangle(2.3, 5.4);
		System.out.println(r1.lenght + " " + r1.width);

		double areaInfo = r.calculateArea(2.3, 5.4);
		System.out.println("Rectangle area is : " + areaInfo);

	}

}
