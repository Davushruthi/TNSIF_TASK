package TASK4;

public class loops {
	public void evensum() {
	int count = 0;
	int sum = 0;
	for(int i=1; i<=100; i++) {
       if(i % 2==0) {
	  sum = sum + i;
	  count++;
     }
       if(count==10) {
    	   break;
       }
  }
	System.out.println(sum);
}
	
	
public void fact() {
	int num = 4;
	int fact = 1;
	for(int i=1; i<= num;i++) {
		fact = fact * i;		
	}
	System.out.println(fact);
}



}