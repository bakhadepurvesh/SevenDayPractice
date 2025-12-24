package Day_One;

public class Methods{
		 
// void  non-parameterized method
	public void getData() {
		String city ="Pune";
		System.out.println("City Name Is :"+city);
	}
	
	
// void  parameterized  method 
 public void printInfo(String name,int rollNo) { 
	 System.out.println("Name Is :"+name);
	 System.out.println("Roll Number IS :"+rollNo);
 }
 
 // return type non-parameterized method 
 public int getAge() {
	 int age = 100;
	 System.out.println("Age is :"+age);
	 return age;
 }
 
 
//return type parameterized method 
 public String getCity(String city) {
	 System.out.println("City IS :"+city);
	 return city;
 }
 
 //parameterized constructor
 
//  public Methods(String day){
//	   this();
//	  System.out.println("Today Day Is :"+day);
//  }
//  
 // non-parameterized constructor
  
//  public Methods() {
//	  System.err.println("Hello I am Default Constructor !");
//  }
  
  // public variable
  public String nameOfMonth="June";
  //private variable
  private String nameOfCar="Honda";
  //protected variable
  protected int age =23;
  // by default variable 
  int pincard;
	  
  public void answerPrint() {
	  System.out.println("Public :"+nameOfMonth);
	  System.out.println("Private :"+nameOfCar);
	  System.out.println("Protected :"+age);
  }
  // Public सर्वत्र access होतो, 
  // protected package आणि subclass मध्ये,
  // default फक्त package मध्ये, 
  // private फक्त class मध्ये.
 
  //-> Constructor चे नाव class नावासारखेच असते.
  //-> Constructor ला abstract, static, final बनवता येत नाही.
  //-> Access modifier ठरवतो object कुठून create करता येईल
  
  
  // static key word used in the variables
  public static int carNumber = 1235;
  
//  Java मध्ये static keyword चा वापर class-level members तयार करण्यासाठी केला जातो.
//  Static variable किंवा method हा object ला नाही तर class ला belong असतो.
//  तो object न बनवता थेट class नावाने access करता येतो.
//  नाही, Java मध्ये static constructor allow नाही कारण
//  constructor object तयार करण्यासाठी असतो. 
  
  
  final int ages = 36;
  
//  Final Variable: एकदा value assign केल्यावर बदलता येत नाही; 
//  object mutable असल्यास त्याचा content बदलू शकतो.
//  Final Method: subclass मध्ये override करता येत नाही.
//  Final Class: subclass बनवू शकत नाही.
  
 //main method
 public static void main(String[]args) {
	   Methods demo = new Methods();
	   demo.answerPrint();
//	   demo.getData();    
//	   demo.getAge();
//	   demo.getCity("Mumbai");
//	   demo.printInfo("Ramesh",23);
 }
 	
}

// methods ->
			// void -> parameterized or non - parameterized method 
			// return -> parameterized or non - parameterized method 

// constructor ->
            // parameterized constructor or non-parameterized constructor
	        // constructor don't have return type 
            // class name or constructor name are same
			// one object call one constructor or constructor chaning is possiable 
	
// access modifier -> 
// -> apply -> variable , method , constructor 
// public , protected ,private , default

//key word 
// static , final

