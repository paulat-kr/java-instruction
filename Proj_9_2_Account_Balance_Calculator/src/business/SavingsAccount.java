package business;
public class SavingsAccount extends Account {

	private double interestRate;
	private double interestPayment;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment() {
		this.interestPayment = calcInterestPayment();
	}

	public double calcInterestPayment() {
		double d1 = interestRate * balance;
		return d1;
	}
	
	public void addInterestPayment() {
		balance += interestPayment;
	}

	
}
