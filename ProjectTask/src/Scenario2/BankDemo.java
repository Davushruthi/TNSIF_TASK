package Scenario2;

public class BankDemo {

	public static void main(String[] args) {
		StudentSavingsAccount ss = new StudentSavingsAccount();
		ss.setaccountHolder("Shruthi Davu");
		ss.setbalance(100000);
		ss.setinterestRate(3.5);
		ss.setdiscount(35);
		ss.display();
		ss.show2();
		ss.show();
	}

}
