package Scenario1;

public class Pizza extends Food {
	private String size;
	
	public String getsize() {
		return size;
	}
	public void setsize(String size) {
		this.size = size;
	}
	
	public void display() {
		System.out.println(getsize());
	}
}
