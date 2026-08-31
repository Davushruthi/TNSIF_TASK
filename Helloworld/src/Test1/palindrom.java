package Test1;

public class palindrom {
	public static void main(String[] args) {
	int a = 315;
	int original = a;
	int rev = 0;
	while(a >0) {
		int digit= a % 10; 
		rev = rev *10 + digit;
		a = a/10;
	}
if (rev == original) {
	System.out.println("Given num " +a +" is palindrom");
}
else {
	System.out.println("Not a palindrom");
}
}
}