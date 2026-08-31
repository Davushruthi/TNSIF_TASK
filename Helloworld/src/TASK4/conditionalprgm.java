package TASK4;

public class conditionalprgm {
	public void basic() {
	 int num = 93;
if(num%2 != 0) {
	System.out.println("Given num " + num+" is odd");
}else {
	System.out.println("Given num "+ num+" is even");
}
}

	public void leapyear() {
		int year=2024;
		if(year % 400 == 0) { 
			System.out.println("The given year "  + year +  " is a leap year");
		}
		else if(year % 100==0) {
				System.out.println("The given year "  + year +  " is not a leap year");
			}
		else if(year % 4 == 0) {
					System.out.println("The given year "  + year +  " is a leap year");
				}
		
		else {
			System.out.println("It is not a leap year");
		}
	}
	
	
	
	
}