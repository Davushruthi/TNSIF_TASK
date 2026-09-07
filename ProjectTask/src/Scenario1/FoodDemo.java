package Scenario1;

public class FoodDemo {

	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.setname("Chicken Pizza");
		p.setprice(300.99);
		p.setsize("Medium");
		p.show();
		p.display();
		System.out.println("");
		Burger b = new Burger();
		b.setname("Chicken Burger");
		b.setprice(350.98);
		b.settype("Non-Veg");
		b.show();
		b.display2();

	}

}
