package javaassignments;

public class SwitchCases {

	public static void main(String[] args) {

		// 1. alphabet character is Vowel or Consonant

		char ch = 'a';

		switch (ch) {
		case 'a':
			System.out.println(ch + "is a vowel");
			break;
		case 'e':
			System.out.println(ch + "is a vowel");
			break;
		case 'i':
			System.out.println(ch + "is a vowel");
			break;
		case 'o':
			System.out.println(ch + "is a vowel");
			break;
		case 'u':
			System.out.println(ch + "is a vowel");
			break;

		default:
			System.out.println(ch + "is a consonant");
		}

		// 2.specific environment like: QA, Stage, Dev, UAT, Prod

		String env = "Prod";

		switch (env) {

		case "QA":
			System.out.println("Run test cases in QA");
			break;
		case "Stage":
			System.out.println("Run test cases in Stage");
			break;
		case "Dev":
			System.out.println("Run test cases in Dev");
			break;
		case "UAT":
			System.out.println("Run test cases in UAT");
			break;
		case "Prod":
			System.out.println("Run test cases in Prod");
			break;

		default:
			System.out.println("Plz pass right env :" + env);
			;
		}

		// 3.WAP to book the specific type of car from the Uber app using Switch - Case.
		// a.Car Type: Mini, Sedan, SUV, Premium
		// b.If user passes wrong car type, print please select the right car type

		String carType = "SUV";

		switch (carType) {
		case "Mini":
			System.out.println("Book car type mini");
			break;
		case "Sedan":
			System.out.println("Book car type Sedan");
			break;
		case "SUV":
			System.out.println("Book car type SUV");
			break;
		case "Premium":
			System.out.println("Book car type Premium");
			break;

		default:
			System.out.println("please select the right car type : " + carType);
			;
		}

	}

}
