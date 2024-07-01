package javaassignments;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee(10, "Tom", 32.20);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

		//update sal by 10 % raise
		emp.setSalary(42.20);
		System.out.println(emp.getSalary());
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());

	}

}
