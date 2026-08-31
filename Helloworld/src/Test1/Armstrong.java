package Test1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int a = 139;
			int original = a;
			 int sum = 0;
			 
			while(a > 0){
			int digit = a % 10;
			sum  = sum + digit*digit*digit;
			a = a /10;
			}
			if( sum == original){
			System.out.println("Armstrong number");
			}
			else{
			System.out.println("Not armstrong number");
			}
			}
			}


	

