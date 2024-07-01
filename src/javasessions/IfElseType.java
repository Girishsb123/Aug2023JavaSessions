package javasessions;

public class IfElseType {

	public static void main(String[] args) {

		String k = "Girish";
		if (k.equals("Girish")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

//		String browser = "chrome";
//
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if (browser.equals("edge")) {
//			System.out.println("launch edge");
//		} else {
//			System.out.println("Plz pass right browser " + browser);
//		}
//		

		String browser = "edge";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else {
			System.out.println("Plz pass right browser " + browser);
		}

	}

}
