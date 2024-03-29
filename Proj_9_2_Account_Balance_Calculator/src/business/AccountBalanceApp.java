package business;
import java.text.NumberFormat;

import util.Console;

public class AccountBalanceApp {

	static NumberFormat cf = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) {

		CheckingAccount c = new CheckingAccount(1000, 1);
		SavingsAccount s = new SavingsAccount(1000, 0.01);
		Account a = null;
		
		System.out.println("Welcome to the Account application");
		System.out.println("\nStarting Balances");
		displayBalances(c, s);
		
		System.out.println("\nEnter the transactions for the month");
		
		String choice = "y";
		String actionType = "";
		String accountType = "";
		double amount = 0;
		
		while (choice.equalsIgnoreCase("y")) {
			actionType = Console.getString(
					"\nWithdrawal or deposit? (w/d}: ", "w", "d");
			accountType = Console.getString(
					"Checking or savings? (c/s}: ", "c", "s");
			// no negatives
			amount = Console.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);
			
			if (accountType.equalsIgnoreCase("C")) {
				a = c;   // set to checking
			
			} else {
				a = s;   // set to savings
			}
			
			if (actionType.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			} else {
				a.deposit(amount);
			}
					
			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
		
		c.subtractMonthlyFee();
		s.setInterestPayment();
		s.addInterestPayment();
		
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee:             " + cf.format(c.getFee()));
		System.out.println("Savings interest payment: " + cf.format(s.getInterestPayment()));
		System.out.println("\nFinal Balances");
		displayBalances(c, s);
		
		System.out.println("\nBye!");
	}
	
	private static void displayBalances(CheckingAccount c, SavingsAccount s) {
		
		System.out.println("Checking: " + cf.format(c.getBalance()));
		System.out.println("Savings: " + cf.format(s.getBalance()));
	}
	

}