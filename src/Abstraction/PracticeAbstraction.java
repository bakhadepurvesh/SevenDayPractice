package Abstraction;

public abstract class PracticeAbstraction {
	
	public int age =23;
	
	public abstract void getName(String name);
	
//	static void getStatic() {
//		System.out.println("Hello I am Static ");
//	}

//	final void getFinal() {
//		System.out.println("Hello I am Final ");
//		getPrivate();
//	}
	
//	private void getPrivate() {
//		System.out.println("Hello I am Private ");
//	}
	
	public void printCity(String city){
		System.out.println("City Parent : "+city);
	}
	
	public PracticeAbstraction() {
		System.err.println("Default Abstract Constructor !");
	}

}

// Hiding the implementation details and showing only the functionality to the user.
// abstraction method is used in-side the abstracted class  
// abstraction method not have a body abstraction provide the Partial abstraction 
// abstraction class have a constructor  but not create an object 
// abstract allow to concrete  methods 

// only concrete -> final,private,static are allowed in the abstract class 
// final ,static , private -> not-abstract method because they not override 

//Abstract method → private चालत नाही
//abstract class final नसतो
//abstract method final नसतो
//Abstract method static नसतो

