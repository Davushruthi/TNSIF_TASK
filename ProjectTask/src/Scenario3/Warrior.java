package Scenario3;

public class Warrior extends Character {
	private int attackPower;
	private String weapon;
	public int getattackPower() {
		return attackPower;
	}
	public void setattackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public String getweapon() {
		return weapon;
	}
	public void setweapon(String weapon) {
		this.weapon = weapon;
	}
	
	public void show2() {
		System.out.println("Attack Power : "+getattackPower());
		System.out.println("weapon : "+getweapon());
	}
}
