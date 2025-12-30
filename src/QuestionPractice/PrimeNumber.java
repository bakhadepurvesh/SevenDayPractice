package QuestionPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int counter =0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
				counter++;
			}
		}
		if(counter==2){
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		
		
		

	}

}

// self number divide or 1 divide 
