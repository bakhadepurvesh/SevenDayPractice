package Day_One;

public class VariablesRule {

	// local or global variable rules
	// Inside the method body is write the local variable
	
	// global variable is instances of class
	// global variable is access in class body 

	// Global variable
	int cardNum = 1234;
   
	public void printNum() {
		
		System.out.println(cardNum);
		
		// local variable
		String cardName="HelloDeveloper";
		System.out.println(cardName);
	}
	 
  public static void main(String[]args) {
	  
	  VariablesRule  variable = new VariablesRule();
	   variable.printNum();
	   
  }
	
}
