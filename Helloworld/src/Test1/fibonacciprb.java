package Test1;

public class fibonacciprb {
	public static void main(String[] args) {
		int a =0;
		int b=1;
		int c;
		int total = 10;
		
		for(int i = 0; i<= total; i++) {
			System.out.print(a + " ");
			c = a+ b;
			a = b;
			b = c;
		}
	}

}