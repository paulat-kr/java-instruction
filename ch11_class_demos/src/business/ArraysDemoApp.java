package business;

import java.util.Arrays;

public class ArraysDemoApp {

	public static void main(String[] args) {
		
		// 2 ways to declare arrays
		int[] numbers = {1,3,5};
		double[] prices = new double[4];
		
		prices[0] = 4.99;
		prices[1] = 7.99;
		prices[2] = 25.99;
		prices[3] = 1.99;
	
		for (int i = 0; i < prices.length; i++) {
			System.out.println("prices[" + i + "] = " + prices[i]);
		}
		
		double sum = 0;
		
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + sum/prices.length);
		
		String[] names = {"Sean", "Johnny", "Matt", "Chea", "John", "Erin"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		
		int[] nbrs = new int[10];
		for (int i = 0; i < 10; i++) {
			nbrs[i] = i*10;
		}
		
		for (int i = 0; i < nbrs.length; i++) {
			System.out.println("nbrs[" + i + "] = " + nbrs[i]);
		}
		
		Product p1 = new Product("java", "Murach's Java Programming", 59.50);
		Product p2 = new Product("andr", "Murach's Android Programming", 49.50);
		
		Product[] pdts = {p1, p2};
		
		for (int i = 0; i < pdts.length; i++) {
			System.out.println(pdts[i]);
		}
		
		// for each loop

		for (int n: nbrs) {
			System.out.println(n);
		}
		
		// binary search on nbrs
		int idx = Arrays.binarySearch(nbrs, 40);
		System.out.println("Postion of 40 in nbrs = " + idx);
		
		// sort array of prices
		Arrays.sort(prices);
		for (double d: prices) {
			System.out.println(d);
		}
		
		// sort array of names
		Arrays.sort(names);
		for (String s: names) {
			System.out.println(s);
		}
		
		for (int i = 0; i < pdts.length; i++) {
			System.out.println(pdts[i]);
		}
		
		Arrays.sort(pdts);
		for (Product p: pdts) {
			System.out.println(p);
		}
		
		// create a 3x3 array
		String [][] ticTacToeGrid = new String[3][3];

		for (int r=0; r < ticTacToeGrid.length; r++) {  		
			// process row
			for (int c=0; c < ticTacToeGrid[r].length; c++) {   
				// process columns
				System.out.println(ticTacToeGrid[r][c] = r + "-" +c);
			}
		}
		
		// display 3x3 array
		String table = "";
		for (int r=0; r < ticTacToeGrid.length; r++) {
			// process row
			String row = "";
			for (int c=0; c < ticTacToeGrid[r].length; c++) {
				// process column
				row+=ticTacToeGrid[r][c] + " ";
		
			}
			row += "\n";
			table += row;
		}
		System.out.println(table);
	}
	
}
