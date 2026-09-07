package Task9;

public class ThisKey {
	String name = "shruthi - instance variable"; //instance variable
	public void Show() {
		int a = 38;
		int b = 32;
		String name = "TNSIF - Local variable";
		System.out.println("sum of a & b is " +(a+b));
		System.out.println(name);
		System.out.println(this.name);
		}

	public static void main(String[] args) {
		ThisKey ob = new ThisKey(); 
		ob.Show();

	}

}
