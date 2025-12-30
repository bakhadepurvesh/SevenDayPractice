package QuestionPractice;

public class ReverseNumberAddition {
	
	public static void main(String[] args) {
		
		int num =1234;
		int box=num;
		int stored = 0;
		
		 while(num>0){
			 
			 int digit = num%10;
			 stored = stored + digit;
			 num=num/10;	 
		 }
		 System.out.println(box +" Addition :"+stored);
		
	}

}
