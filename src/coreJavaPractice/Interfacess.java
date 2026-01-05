package coreJavaPractice;

public interface Interfacess {

	// simple by default abstract
	public void printName();
	
	// abstract method
	public abstract void printCity(String city);
	
	// before 8+
	public static void getAge() {
		System.out.println("Static Age");
	}
	
	default void getAddress() {
		System.out.println("Default Address :");
		getState();
	}
	
	private void getState() {
		System.out.println("Private State");
	}
	
}

// interface only allowed the abstract methods 
// interface don't have constructor 
// interface have 8+ add concrete method -> static ,private ,default
// interface provide 100% abstraction 
// class to interface we can used the Implements key word
// class to class extends key word used
