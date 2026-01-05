package coreJavaPractice;


public class ChildInterface implements Interfacess
{

	@Override
	public void printName() {
		System.err.println("Child Interface PrintName ");
	}

	@Override
	public void printCity(String city) {
		System.err.println("Child Interface PrintCity "+city);
	}

	
	
}
