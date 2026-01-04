package coreJavaPractice;

//public abstract class AbstractPractice{
	
//    public abstract void printStates();
	
//	public void printName() {
//		printPrivate();
//		System.out.println("Hello Name");
//	}
	
//	public AbstractPractice() {
//		System.err.println("Abstrct Constructor ");
//	}
	
//	public static void printCity() {
//		System.out.println("Static Method :");
//	}
	
//	public final void printAge() {
//		System.err.println("Age Final ");
//	}

//	private void printPrivate() {
//		System.out.println("Private Method ");
//	}
	
//	protected void printProtected() {
//		System.err.println("Protected Method ");
//	}
	
//    public int age = 23;
	
//}

///****************************************
//public class Encapsulation{

//	private int id;

//	private String name;

//	private String city;
	
//	private float salary ;

//	public int getId() {
//	   return id;
//	}

//	public void setId(int id) {
//		this.id = id;
//	}
	
//	public String getName() {
//		return name;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}

//	public String getCity() {
//		return city;
//	}

//	public void setCity(String city) {
//		this.city = city;
//	}

//	public float getSalary() {
//		return salary;
//	}

//	public void setSalary(float salary) {
//		this.salary = salary;
//	}

//}

/// Inheritances 

//public class Parents{
	
//	public int age = 23;
	
//	public Parents() {
//		System.out.println("Parent Constructor ");
//	}

//	public void printSimpleName() {
//		System.out.println("Parent Name ");
//	}

//	private void printPrivate() {
//		System.out.println("Private Method ");
//	}
	
//	protected void printProtected() {
//		System.out.println("Protected Method ");
//	    printPrivate();
//	}
	
//	static void printStatic() {
//		System.out.println("Ststic Keyword ");
//	}
	
//	final void printFinal() {
//		System.out.println("Final keyWord ");
//	}
//}

// Inheritance , Encapsulation , Abstraction ,polymorphism
// Inheritance is uesd to parent child relation
// Encapsuation is binding the data into single unit 
// Abstraction is used to hinding the implementation 
// Interface is provide the 100% Abstraction 

///**********************************************

//public class This_Super {

//	public int age;
//	public String city;
//	
//	public void getPrint(int age,String city) {
//		this.age = age;
//		this.city = city;
//		System.out.println(this.age);
//		System.out.println(this.city);
//	}
	
//	public static void main(String[] args) {
//		
//		This_Super ths = new This_Super();
//		ths.getPrint(101, "Mumbai");
//		ths.getRollNo();
//		
//	}
	
//	public void getRollNo() {
//		int rollNo =10;
//		System.out.println(rollNo);
//		this.getCardName();
//	}

//	public void getCardName() {
//		System.out.println("Card Name");
//	}

//}

///this → सध्याच्या class च्या object ला refer करतो
///super → parent class च्या object ला refer करतो

//********************************************

//public class keyWord{
//	
//	public String name ="Developer";
//	private String city ="pune";
//	protected int rollNum = 123;
//	 default

//	public static int age =23;
	
// static variable , method ,class -> 	
//	Static variable कुठे access करता येतो?
//  1. Same class मध्ये
//	2. Same package मधील दुसऱ्या class मध्ये
	
/// Different package मधील class मध्ये nahi karata yet 
	
// e.g => public static int age = 25;
/// public static variable / method कुठूनही access करता येतो (any class, any package).

//	public static void main(String[] args) {
//		System.out.println(age);
//	}
	
//}
// there are four access modifier 
// public access any where or private access only this class or protected access there or there sub-class
// default access only interface 

///*********************************************

//public class methods_or_Constructor{

	    // non-parameterized constructor 
//		public methods_or_Constructor() {
//			System.err.println("Hello Default Constructor !");
//		}
		
		// parameterized constructor 
//		public methods_or_Constructor(String name) {
//			System.err.println("Name :"+ name);
//		}
	
	// void method -> non-parameterized method
//	public void printName(){
//		System.out.println("Dog");
//	}
	
	// void method -> parameterized method
//	public void printName(String city){
//		System.out.println("City Name :"+city);
//	}
		
	// return type ->non-parameterized method
//	 public int getAge() {
//		 int age =23;
//		 System.out.println(age);
//		 return age;
//	 }
	
	// return type ->parameterized method
//	 public float getSalary(float salary) {
//		System.out.println("Salary "+salary);
//		return salary;
//	 }
	 
//	}
	
// methods or constructor 

// constructor there are two types of constructors 
// parameterized or non- parameterized method
// constructor or class name are same

// there are two types of method 
// parameterized or non- parameterized method 
// return type methods

//*************************************
//public class DataTypes {

//	public static void main(String[] args) {
//
//		int a = 12;
//	    short b =213;
//		char c = 'a';
//		float f = 23.4f;
//		double d = 123.6;
//		long l = 2417357298l;
//		boolean n = true;
//		byte j = 23;
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(l);
//		System.out.println(n);
//		System.out.println(j);	
//	}

//}

// there are two datatypes Primitive or non-Primitive
// non- primitive datatypes are user define or primitive datatypes predefine
// primitive datatypes are -> 8 


//**************************************
//public class Variables {

// global variable 
	
//	 String name = "Suyash";
	
//	public static void main(String[] args) {
	
//		Variables var = new Variables();
//		System.out.println("Global Variable :"+var.name);
//		
//		// local variable
//		int age =23;
//		System.out.println("Local Variable :"+age);
	
//	}
//}

// local variables or global variables 
// local variables is access only inside the method 
// global variables is access a class 