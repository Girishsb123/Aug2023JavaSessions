package javaassignments;

public class TestCollege {

	public static void main(String[] args) {

		College c = new College();
		c.science();
		c.arts();
		c.commerce();
		c.globalResult();

		// System.out.println(UKUniversity.min_fee);// 100
		System.out.println(c.min_fee);// 50

		// top casting - child class object is referred by parent interface reference
		// var
		UKUniversity uk = new College();
		uk.science();
		uk.commerce();
		uk.globalResult();
		// uk.admission(); ref type will be failed - parent can't access child class
		// methods

		//UKUniversity.billing();// UK billing
		College.billing();
		
		//down casting -- NA
		//College c = new UKUniversity();
	}

}
