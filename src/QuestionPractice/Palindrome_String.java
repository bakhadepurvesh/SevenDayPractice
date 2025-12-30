package QuestionPractice;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String  name ="wow";
	    String duplicate = name;
	    String rev ="";
	 
	    for(int i=name.length()-1;i>=0;i--){    	
	    	 rev = rev + name.charAt(i);
	    }
	  
	     if(duplicate.equals(rev)){
	    	 System.out.println("Palindrome_String");
	     }
	     else {
	    	 System.err.println("Not-Palindrome_String");
	     }
	}
	
}
