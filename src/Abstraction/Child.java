package Abstraction;

public class Child extends PracticeAbstraction
{
	public int age = 22;

	@Override
	public void getName(String name) {
		System.out.println("Name Child :"+"="+name);
	}

	public Child() {
		System.out.println("Child Constructor !");
	}
}
