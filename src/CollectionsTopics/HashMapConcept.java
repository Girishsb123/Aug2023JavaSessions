package CollectionsTopics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> userList = new HashMap<Integer, String>();
		userList.put(1, "Puppy");
		userList.put(2, "Sweety");
		userList.put(3, "Ashu");
		userList.put(4, "Kishore");
		
		System.out.println(userList);
		
		HashMap<String, String> empInfo = new HashMap<String, String>();
		empInfo.put("Puppy", "QA");
		empInfo.put("Sweety", "Dev");
		empInfo.put("Ashu", "SDET1");
		empInfo.put("Ashu", "SDET2");
		
		System.out.println(empInfo);
		
		empInfo.put("Naveen", null);
		empInfo.put("girish", null);
		
		System.out.println(empInfo);
		
		empInfo.put(null, "null");
		
		System.out.println(empInfo);
		
		empInfo.put(null, "null");

		System.out.println(empInfo);
		
		
		
		
		
		

	}

}
