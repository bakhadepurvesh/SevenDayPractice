package QuestionPractice;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int stored =0;
		
		while(num>0){
			
			int digit = num%10;
			stored = stored * 10 + digit;
			num = num/10;	
		}
		 System.out.println(stored);
		
		
		
	}

}
