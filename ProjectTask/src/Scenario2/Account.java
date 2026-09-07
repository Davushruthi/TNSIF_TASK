package Scenario2;

public class Account {
	private String accountHolder;
	private double balance;

	public String getaccountHolder() {
		return accountHolder;
	}
	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("AccountHolder name: "+getaccountHolder());
		System.out.println("Balance : "+getbalance());
	}

}

