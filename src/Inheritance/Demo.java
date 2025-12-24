package Inheritance;

public class Demo {

	public static void main(String[] args) {
		
// child class object 
		
//		Child child = new Child();
//		child.getName();                // I am Child Method
//		child.getNumber();    			// Child :12
//		child.color();                 // parent method access by child
//		System.out.println(child.id); // 23
		
// parent class object 
		
		Parent parent = new Parent();
		parent.getName();           // parent
		parent.getNumber();         // parent
		// parent can not access child class method 
		System.out.println(parent.id); // parent
		
		
// parent reference or child constructor
		
//		Parent p = new Child();
//		p.getName();  // child
//		p.getNumber(); // child
//		System.out.println("Variable "+p.id); // parent
				
// jo class load hona tya class che variable hunting hona
// jo class constructor aahe tya class che method dis nar
	}
	
}
