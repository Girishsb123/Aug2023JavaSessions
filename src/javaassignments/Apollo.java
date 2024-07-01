package javaassignments;

public class Apollo extends Hospital {

	// Hospital
	@Override
	public void generalPhysician() {
		System.out.println("AP -- generalPhysician");
	}

	@Override
	public void admission() {
		System.out.println("AP -- admission");
	}

	// Apollo
	public void surgeon() {
		System.out.println("AP -- surgeon");
	}

	public void pediaService() {
		System.out.println("AP -- pediaService");
	}

}
