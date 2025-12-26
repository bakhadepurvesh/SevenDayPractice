package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
//		PracticePolymorphism poly = new PracticePolymorphism();
//		poly.printName("Mumba");     // parent 
//		poly.printName("Mumbai");  
//		poly.printName("Suresh",101);
	
//		Child child = new Child();
//		child.printName("Pune"); // child
		
		
		// Parent reference object or child constructor
		
		PracticePolymorphism p = new PracticePolymorphism();
		
		PracticePolymorphism poly = new Child();
		poly.getName(p);
//		poly.printName("Hello");
		
	}
 
	// output 
	
	// child -> default Parent constructor
	//       -> Child Constructor !
	// "Hello Child "+ name 
	// child -> default Parent constructor
	//       -> Child Constructor !
	
}
