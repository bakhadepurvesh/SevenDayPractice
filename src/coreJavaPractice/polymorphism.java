package coreJavaPractice;

public class polymorphism {

	// method overloading is called compile time polymorphism
	public void printStudent(String name){
		System.out.println("Nam :"+name);
	}
	
	public void printStudent(String name, int age){
		System.err.println(name+" And "+age);
	}

//	 private method
	private void printAge(int rollNo) {
		System.out.println("Roll No :"+rollNo);
	}
	
    private void printAge() {
    	printAge(100);
		System.err.println("Print Age ");
	}
    
    // protected method
    protected void printProtected() {
    	printAge();
    	System.out.println("Protected Method");
    }
    
    protected void printProtected(String method) {
    	System.err.println("Parameter Protected Method"+method);
    }
	
    // static method 
    static void printStatic() {
    	System.out.println("Static Method");
    }
    
    static void printStatic(String method) {
    	System.err.println("Parameter Static Method "+method);
    }
    
    // final method
    final void printFinal() {
    	System.out.println("Final Method");
    }
    
    final void printFinal(String method) {
    	System.err.println("Parameter Final Method ");
    }
 
    // constructor
    public  polymorphism () {
    	System.out.println("Default Constructor ");
    }
    
    public  polymorphism (String constr) {
    	System.err.println("Constructor Parameter :"+constr);
    }
    
}

// polymorphism is called same method name different parameter
