package Scenario2;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public double getinterestRate() {
		return interestRate;
	}
	public void setinterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void show() {
		System.out.println("Interest: "+getinterestRate());
	}
}
