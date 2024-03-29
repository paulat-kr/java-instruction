package ui;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		String[] codes1 = new String[3];
		
		codes1[0] = "jsp";
		codes1[1] = "java";	
		codes1[2] = "mysql";	
		
		for (String s: codes1) {
			System.out.println(s);
		}
		
		//ArrayList<> can have <Integer/Double/String/Product/Stuffy/etc.>
		ArrayList<String> codes2 = new ArrayList<>();
		codes2.add("jsp");
		codes2.add("java");
		codes2.add("mysql");

		for (String s: codes2) {
			System.out.println(s);
		}
		
		System.out.println(codes2);
		
		System.out.println("\ntrying some methonds on p. 391");
		System.out.println(codes2.contains("jsp"));   // returns true
		System.out.println(codes2.contains("java"));  // returns true
		System.out.println(codes2.contains("Java"));  // returns false
		
		Collections.sort(codes2);
		System.out.println(codes2);		// prints sorted list
		
		System.out.println(codes2.indexOf("java"));
		System.out.println(codes2.isEmpty());
		String str1 = codes2.remove(1);
		System.out.println(str1);
		System.out.println(codes2);
		
		System.out.println(codes2.remove("java"));
		System.out.println(codes2);
		codes2.clear();
		System.out.println(codes2);
		

	}

}