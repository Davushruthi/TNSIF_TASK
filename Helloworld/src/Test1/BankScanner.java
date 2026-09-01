package Test1;
import java.util.Scanner;

public class BankScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
	    double balance = 0;
	    double deposit;
	    double withdraw;
	    System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter deposit Money: ");
        deposit = sc.nextDouble();

        balance = balance + deposit;
        System.out.println("Balance: " + balance);
        

        System.out.print("Enter withdrawal amount: ");
        withdraw = sc.nextDouble();

        balance = balance - withdraw;

        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);

        sc.close();
    }
}




	    

		       

		        