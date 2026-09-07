package Scenario2;

public class StudentSavingsAccount extends SavingsAccount {
	private double discount;
	
	public double getdiscount() {
		return discount;
	}
	public void setdiscount(double discount) {
		this.discount = discount;
	}
	
	public void show2() {
		System.out.println("Discount : "+getdiscount());
	}
}
