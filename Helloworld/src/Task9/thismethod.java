package Task9;

public class thismethod {
	int a = 90;
	public void show() {
		int a = 100;
		System.out.println(this.a);
		String name = "Shruthi";
		System.out.println(name);
	}
	public void display() {
		this.show();
	}

	public static void main(String[] args) {
		thismethod n = new thismethod();
		n.display();
		//this.show(); // can't use in static
	}

}
