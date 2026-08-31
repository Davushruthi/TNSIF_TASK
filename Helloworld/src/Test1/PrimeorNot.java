package Test1;

public class PrimeorNot {
	public static void main(String[] args) {
		int a = 7;
		int count =0;
		for(int i = 1; i<=a ;i++) {
			if(a % i == 0) {
				 count++;
			}
		}
		if(count == 2) {
			System.out.println("The given num " +a +" is prime");
		}else {
			System.out.println("The given num " +a +" is not prime");
		}
		
	}

}
