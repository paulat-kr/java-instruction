package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import business.Product;
import util.Console;

public class ProductApp {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		Product p1 = new Product("java", "Murach's Java", 59.50);
		Product p2 = new Product("jsp", "Murach's JSP", 49.50);
		Product p3 = new Product("mysql", "Murach's MySQL", 39.50);
		Product p4 = new Product("c#", "Murach's C#a", 29.50);
		Product p5 = new Product("andr", "Murach's Android", 19.50);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		String code = Console.getString("Enter a code: ");
		
		// retireve the product that matches the code entered
		Product pdt = null;
		for (Product p: products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				// that's my product!
				pdt = p;
			}
		}
		System.out.println(pdt);
		
		
		// same thing, but with a HashMap
		System.out.println("Get product from map");
		Map<String, Product> productsMap = new HashMap<>();
		productsMap.put("java",  p1);
		productsMap.put("jsp",  p2);
		productsMap.put("mysql",  p3);
		productsMap.put("c#",  p4);
		productsMap.put("andr",  p5);
		
		System.out.println("Product selected: " + productsMap.get(code));
				
		System.out.println("Bye");
	}

}
