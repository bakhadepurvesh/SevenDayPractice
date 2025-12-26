package Encapsulation;

public class Demo {
	
	public static void main(String[] args) {
		
		 PracticeEncapsulation emp = new  PracticeEncapsulation();
		 emp.setId(98);
		 emp.setCity("Pune");
		 emp.setName("Ram");
		 
		 System.out.println("Employee Id :"+emp.getId());
		 System.out.println("Employee Name :"+emp.getName());
		 System.out.println("Employee City :"+emp.getCity());
		
	}

}
