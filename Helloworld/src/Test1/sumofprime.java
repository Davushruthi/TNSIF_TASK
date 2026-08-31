package Test1;

public class sumofprime {
	public static void main(String[] args){
		int count=0;
		int sum = 0;
		for(int num=2; count<20; num++){
		int factor=0;
		for(int i =1; i<num;i++){
		if(num%i ==0){
		factor++;
		}
		if(factor ==2)
		{
		sum +=num;
		count++;
		}
		}
		
		}System.out.println(sum);
		}}




