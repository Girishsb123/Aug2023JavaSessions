package javaassignments;

public class Max extends Hospital {

	// Max
	public void ENTService() {
		System.out.println("Max -- ENTService");
	}

	public void gynoService() {
		System.out.println("Max -- gynoService");
	}

	@Override
	public void admission() {
		System.out.println("Max -- admission");
	}

}
