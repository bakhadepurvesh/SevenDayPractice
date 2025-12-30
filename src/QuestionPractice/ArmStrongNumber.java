package QuestionPractice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int box = num;
		int stored = 0;
		
		while(num!=0) {
			
			int digit = num%10;
			stored = stored + (digit*digit*digit);
			num=num/10;
		}
		if(stored==box){
			System.out.println("Armstrong Number ");
		}else {
			System.err.println(" Not Armstrong Number");
		}
		
		
	}
	
	
}
