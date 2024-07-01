package javaassignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		// Q1: WAP to delete a specific number from the given array.

		// int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };

		// Need to remove 22 from the p[] array.
		// output should be: [1, 4, 5, 2, 3, 31, 2]

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };

		int[] a = new int[p.length - 1];//

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

		System.out.println("------------");

		//  Q2: Write a program to create a static Array, having following cricket data:

		// name, age, team name, DOB, gender, Strike Rate
		// Try to create multiple Object Arrays for different players 
		//  Try to print all the values of each player on the console

		Object[] player = { "Kholi", 35, "bharat", "14/06/1988", 'M', 112.34 };
		Object[] player1 = { "Rohit", 37, "bharat", "14/06/1985", 'M', 102.34 };
		Object[] player2 = { "Rahul", 30, "bharat", "14/06/1992", 'M', 98.34 };

		System.out.println(Arrays.toString(player));
		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));

		System.out.println("------------");

		// 1. Write a Java program to create a new array list, which contains all color
		// names.
		// add some colors (string)
		// and print out the colorslist using loops.

		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

		for (String color : colors) {
			System.out.println(color);
		}

		//   2. Write a Java program to retrieve an element at a specified index from a
		// given array list.
		colors.get(2);// blue

		System.out.println("------------");

		// 3. Write a Java program to update specific array element by given element.

		colors.set(1, "Purple");
		System.out.println(colors);

		System.out.println("------------");

		// 4. Write a Java program to remove the third element from an array list. 

		colors.remove(2);
		System.out.println(colors);

		System.out.println("------------");

		// 5. Write a Java program to search an element in an array list using for loop.
		// Once we find that element, break the loop.

		for (String color : colors) {
			System.out.println(color);
			if (color.equals("blue")) {
				System.out.println("color found ....");
				break;
			}
		}

		System.out.println("------------");

		// 6. Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();

		studentNames.add("Varun");

		studentNames.add("Reena");

		studentNames.add("Naveen");

		studentNames.add("Robin");

		studentNames.add("Peter");

		// for loop
		for (int i = studentNames.size() - 1; i >= 0; i--) {
			System.out.println(studentNames.get(i));
		}

		System.out.println("------------");

		// 7. Write a Java program to extract a portion of an array list.
		ArrayList<String> portion = new ArrayList<>(colors.subList(1, 3));

		System.out.println(portion);

		System.out.println("------------");

		// 8. Write a Java program to empty an array list.

		// colors.clear();
		// System.out.println(colors);

		System.out.println("------------");

		// 9. Write a Java program to trim the virtual capacity of an array list the
		// current list size.

		colors.trimToSize();
		System.out.println(colors.size());

		System.out.println("------------");

		// 10. Write a Java program to print all the elements of an ArrayList using the
		// position of the elements.

		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Element at index " + i + " is " + colors.get(i));
		}

	}

}
