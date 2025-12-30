package QuestionPractice;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int num = 212;
		int number = num;
		int store = 0 ;
		
		 while(num>0){			 
			 int digit = num%10;
			 store = store *10 + digit;
			 num = num/10;

		 }
		  if(store == number){
			  System.out.println("Palindrome_Number");
		  }
		  else{
			  System.out.println("Not Palindrome_Number");
		  }
		
		
		
	}
	
	
}
