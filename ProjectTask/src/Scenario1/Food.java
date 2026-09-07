package Scenario1;

public class Food {
	private String name;
	private double price;
	
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	public void show() {
		System.out.println(getname());
		System.out.println(getprice());
	}
}
