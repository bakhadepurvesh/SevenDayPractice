package Inheritance;

public class Parent {
	
	 // variable 
	 public int id = 120;
	 
	 public static void getStatic() {
		 System.err.println("Hello I am Parent Static");
	 }
	 
	 public final void getFinal() {
		 System.out.println("Hello I am Parent Final");
	 }

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
	 
	 public void color() {
		 System.out.println("parent color");
	 }
	 
	 // protected method 
	 protected void getProtected() {
		 System.out.println("I am Parent Protected ");
		 getPrivate();
	 }
	 
	 // private method 
	 private void getPrivate() {
		 System.out.println("I am Parent Private");
	 }

}

// The Inheritances parent property child class aquired 
// is called as inheritances 
// variable , methods , constructor , return-method

// -> access modifier, static, final

// variable can not be override or overload
// constructor  can not override 

// methods ->
// protected override hote 
// private override hot nahi 

