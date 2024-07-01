package javaassignments;

public class College extends VTU implements UKUniversity, USUniversity, IndianUniversity {

	// int min_fee = 50;

	// Ind
	@Override
	public void ba() {
		System.out.println("college -- ba");

	}

	@Override
	public void bcom() {
		System.out.println("college -- bcom");

	}

	// US
	@Override
	public void pysocology() {
		System.out.println("college -- pysocology");

	}

	@Override
	public void engineering() {
		System.out.println("college -- engineering");

	}

	// UK
	@Override
	public void science() {
		System.out.println("college -- science");

	}

	@Override
	public void commerce() {
		System.out.println("college -- commerce");

	}

	@Override
	public void arts() {
		System.out.println("college -- arts");

	}

	// college
	public void admission() {
		System.out.println("college -- admission");
	}

	@Override
	public void globalResult() {
		System.out.println("college -- globalResult");

	}

	@Override
	public void sports() {
		System.out.println("college -- sports");

	}

	// Method hiding
	public static void billing() {
		System.out.println("College -- billing");
	}

	public void RND() {
		System.out.println("College -- RND");
	}

}
