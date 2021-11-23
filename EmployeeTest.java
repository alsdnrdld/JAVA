package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println(Employee.getSerialNum());
		
		Employee employee = new Employee();
		employee.setEmployeeName("김민욱");
	    
	    //System.out.println(employee.serialNum);
	    
	    Employee employeeKim = new Employee();
	    employeeKim.setEmployeeName("김신록");
	    
    
	    System.out.println(employee.getEmployeeName()+"님의 사번은 "+employee.getEmployeeId());
	    System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId());  
	    
	    
	    
	 

	}

}
