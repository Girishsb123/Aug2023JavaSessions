package javaassignments;

public class IfElseConditionStatement {

	public static void main(String[] args) {

		short a = 25, b = 78, c = 87, d = 97;

		if (a > b && a > c && a> d) {
			System.out.println("a is greatest");
		} else if (b > c && b > d) {
			System.out.println("b is greatest");
		} else if (c > d ) {
			System.out.println("c is greatest");
		} else {
			System.out.println("d is greatest");
		}
		
		
		System.out.println("--------------");
		
		//0dd 0r Even 
		byte num= 1;
		if(num % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}

	}
	

}
