package javaassignments;

public class TestHospital {

	public static void main(String[] args) {

		Apollo ap = new Apollo();
		ap.admission();// overridden
		ap.emergency();// inherited
		ap.surgeon();// individual
		ap.pediaService();

		// top casting - child class object is referred by parent ref var
		Hospital h = new Apollo();
		h.admission();
		h.emergency();
		// h.surgeon(); - ref type will be failed hence can't access child class
		// individual methods

		Fortis fh = new Fortis();
		fh.dentalService();// individual
		fh.oncologyService();
		fh.emergency();// inherited

		Max m = new Max();
		m.admission();// overridden
		m.ENTService();// individual
		m.gynoService();

		// down casting - parent class object is referred by child class object ref
		try {
			Fortis f = (Fortis) new Hospital();
			f.admission();
		} catch (Exception e) {
			System.out.println(" ClassCastException is coming");
			e.printStackTrace();
		}

		System.out.println("BYE");

//		finally {
//			System.out.println("Finally block");
//		}
	}

}
