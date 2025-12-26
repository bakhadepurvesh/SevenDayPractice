package Polymorphism;

public class PracticePolymorphism {

	// Polymorphism method

//	public void printName(String city) {
//		System.out.println("Parent Class:"+city);
//	}

//	protected void printName() {
//		System.err.println("Hello I am Empty !");
//	}
	
//	public int printName(String name ,int num) {
//		System.out.println("name : "+name);
//		System.out.println("Return Number is : "+num);
//		return num;
//	}
	
	public PracticePolymorphism getName(PracticePolymorphism name) {
		System.out.println("Parent Class !");
		return name;
	}
	
	
	
	// Polymorphism constructor 
	
	public PracticePolymorphism() {
		System.out.println("default Parent constructor ");
	}

	
//	public PracticePolymorphism(String parameter) {
//		System.err.println("Parameterized constructor "+parameter);
//	}
	
//	protected PracticePolymorphism(int age) {
//		System.out.println("Age Is "+ age);
//	}
	
}
// polymorphism it means same method different parameter  
// polymorphism is dependent upon the parameter
// not to be the method name or return type 
// there are two types of polymorphism compile or runtime polymorphism
// compile time polymorphism is called overloading
// runtime polymorphism is called overriding
// variable can't be overload 



