package coreJavaPractice;

public class DemoPolymorphism {

	public static void main(String[] args) {
		
		polymorphism  poly = new polymorphism ();
		poly.printStudent("Hello");
		poly.printStudent("Developer", 101);
		poly.printProtected();
		poly.printProtected("Suyash");
		poly.printStatic();
		poly.printStatic("Static");
		poly.printFinal();
		poly.printFinal("Final");
		
		
		
	}
	
}
