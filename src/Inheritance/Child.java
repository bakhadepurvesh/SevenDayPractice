package Inheritance;

public class Child extends Parent
{
	//variable 
	public int id = 23;

	
	@Override
	public void getName() {
	   System.out.println("I am Child Method");
	}

	@Override
	public int getNumber() {
		int  number =12;
		System.out.println("Child :"+number);
		return number;
	}
	
	// constructor 
	public Child() {
		System.out.println("Child Constructor");
	}
	
	public void myColor() {
		System.out.println("Child color");
	}
	

	
}
