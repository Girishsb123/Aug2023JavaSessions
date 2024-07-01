package javaassignments;

public class StringManipulations {

	public static void main(String[] args) {

		// 1.Check string equality
		String s1 = "hello";
		String s2 = "Hello";

		System.out.println(s1.equals(s2));// false

		// 2. Remove all  spaces in a String . 
		// For example:“         Hello      Everyone       “ .    
		// Expected result: “HelloEveryone”.

		String s = " Hello    Everyone  ";
		System.out.println(s.replace(" ",""));
	}

}
