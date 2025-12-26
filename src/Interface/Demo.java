package Interface;

public class Demo {

	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.getDefault();
//		child.show();
//		child.showData();
		
		PracticeInterface demo = new Child();
		System.out.println(demo.age);
		System.out.println(PracticeInterface.num);
		System.out.println(demo.name);
		
		demo.getDefault();
		demo.show();
		demo.showData();
	    PracticeInterface.getStatic();
		
	}
	
}
