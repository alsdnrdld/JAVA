package ch16;

public class Employee {


 private static int serialNum = 1000;

 
	
  




private int employeeId;
  private String employeeName;
  private String department;
  
  public Employee(){
	  serialNum++;  // 입력한 값을 먼저 대입한 후 1 증가시키라는 뜻;
	  employeeId = serialNum;
	  
  }
  
  
  
  
  
  
  
public static int getSerialNum() {
		return serialNum;
		
		/* 메서드가 호출이 되었을 때 메서드가 수행이 되려면
		 * 메서드 안에 있는 요소들은 다 메모리를 가지고 있어야하므로 
		 * 스태틱 메서드 안에서는 인스턴스 변수(=멤버변수)들을 사용할 수 없다. 
		 * 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음.
		 * */
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
  
  



}
