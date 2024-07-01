package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "firefox  ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("Plz pass right browser " + browser);
			break;

		case "opera":
			System.out.println("launch opera");
			break;
		}

//		char ch = 'A';
//		switch (ch) {
//		case 'a':
//			System.out.println(ch + " is a vowel");
//			break;
//		case 'e':
//			System.out.println(ch + " is a vowel");
//			break;
//		case 'i':
//			System.out.println(ch + " is a vowel");
//			break;
//		case 'o':
//			System.out.println(ch + " is a vowel");
//			break;
//		case 'u':
//			System.out.println(ch + " is a vowel");
//			break;
//
//		default:
//			System.out.println(ch + " is a consonent");
//			break;
//		}
		
		char ch = 'A';
		switch (ch) {
		case 'A':
			System.out.println(ch + " is a vowel");
			break;
		case 'E':
			System.out.println(ch + " is a vowel");
			break;
		case 'I':
			System.out.println(ch + " is a vowel");
			break;
		case 'O':
			System.out.println(ch + " is a vowel");
			break;
		case 'U':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");
			break;
		}
	}

}
