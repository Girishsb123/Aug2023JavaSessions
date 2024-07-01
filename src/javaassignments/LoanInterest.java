package javaassignments;

public class LoanInterest {

	public static void main(String[] args) {
		// WAP to define the interest rate on the basis of Loan type using Switch Case
		// a.Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		// 1.For Housing Loan, if user’s salary is less than 35000 USD - print : NOT
		// APPLICABLE FOR Housing Loan

		String loanType = "Housing Loan";
		double salary = 30000;
		double interestRate;

		switch (loanType) {
		case "Car Loan":
			interestRate = 6.5;
			break;
		case "Housing Loan":
			if (salary < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				return;
			}
			interestRate = 7.5;
			break;
		case "Personal Loan":
			interestRate = 10.0;
			break;
		case "Education Loan":
			interestRate = 8.0;
			break;
		default:
			System.out.println("Invalid loan type");
			return;
		}

		System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");
	}
}
