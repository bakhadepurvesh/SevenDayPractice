package coreJavaPractice;

public class DemoInterface {

	public static void main(String[] args) {
		
		Interfacess ref = new ChildInterface();
		ref.printName();
		ref.printCity("pune");
		ref.getAddress();
		Interfacess.getAge();
		
	}
}
