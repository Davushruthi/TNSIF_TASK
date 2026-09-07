package Scenario3;

public class Character {
	private String name;
	private int health;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public int gethealth() {
		return health;
	}
	public void sethealth(int health) {
		this.health = health;
	}
public void show() {
	System.out.println("Name :" +getname());
	System.out.println("Health :" +gethealth());
}
}
