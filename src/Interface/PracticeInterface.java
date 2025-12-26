package Interface;

public interface PracticeInterface {
	
	public int age =24;
    static int num = 999;
    final String name ="sitaram";

	public void show();
	
    public void showData();
    
    public static void getStatic() {
    	System.out.println("Static Methods");
    }
    
    private void getPrivate() {
    	System.out.println("Private Methods");
    }
    
    default void getDefault() {
    	getPrivate();
    	System.out.println("Default Methods");
    }
    
}
//An interface is a blueprint of a class.
// It contains only method declarations (no implementation).
// Interface allow to the 100% abstraction 
// protected access modifier use करता येत नाही.