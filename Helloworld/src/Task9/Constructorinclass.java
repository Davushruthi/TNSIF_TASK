package Task9;

public class Constructorinclass {
	Constructorinclass(){
		System.out.println("This is inastance constructor");
	}
	 Constructorinclass(int x){
		 this();
		 System.out.println(x);
		
		 }
	public void Demo() {
		int a = 70;
		int b = 30;
		System.out.println((a+b));
	}
	public static void main(String[] args) {
		 Constructorinclass ob = new  Constructorinclass (30);
		 ob.Demo();
		 // this.Constructorinclass(); // not called on static class
		 

	}

}
