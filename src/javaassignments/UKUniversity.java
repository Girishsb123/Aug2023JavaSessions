package javaassignments;

public interface UKUniversity extends WEC {

	int min_fee = 100;// static and final by default

	public void science();

	public void commerce();

	public void arts();

	public void sports();

	// two changes after JDK 1.8

//	public static void billing() {
//		System.out.println("UK -- billing");
//	}

	default void RND() {
		System.out.println("UK -- RND");
	}

}
