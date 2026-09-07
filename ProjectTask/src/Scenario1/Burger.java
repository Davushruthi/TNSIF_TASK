package Scenario1;

public class Burger extends Food {
	private String type;
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public void display2() {
		System.out.println(gettype());
	}
}
