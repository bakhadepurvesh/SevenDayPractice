package Polymorphism;

public class Child extends PracticePolymorphism {

	public Child() {
		super();
		System.err.println("Child Constructor !");	
	}

	@Override
	public PracticePolymorphism getName(PracticePolymorphism name) {
		System.out.println("Hello Child "+ name );
		return name;
	}

//	@Override
//	public void printName(String city) {
//		System.out.println("Child Class :"+city);
//	}


	
	
	

}
