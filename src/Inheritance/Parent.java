package Inheritance;

public class Parent {
	
	// variable 
	 public int id = 120;
	 
	 
	 // method
	 public void getName() {
		 System.out.println("I am Parent Method");
	 }
	 
	 // return type method 
	 public int getNumber() {
		 int number =34;
		 System.out.println("Parent :"+number);
		 return number;
	 }
	 
	 // constructor 
	 public Parent() {
		 System.out.println("I am a Parent Constructor");
	 }
	 
//	 public void color() {
//		 System.out.println("parent color");
//	 }
	 

}

// The Inheritances parent property child class aquired 
// is called as inheritances 
// variable , methods , constructor , return-method

// -> access modifier , static , final

// variable can not be override or overload
// constructor  can not override 