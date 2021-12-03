package ch02;
/* < 상 황 > 
 * 회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과 
   이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함

   물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름 
   여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
   멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
 */


// Step 1. 일반 고객 클래스 구현
/* 1) 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
 * 2) 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
 * 3) 일반 상담원이 배정된다.
 * */
public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio; 
	
	
	public Customer() {
		bonusRatio = 0.01;
		customerGrade = "Silver";
	}
	
	public int calcPrice(int price) {  
		bonusPoint += price * bonusRatio;
		return price;
		
		/* 고객이 얼마짜리 물건을 샀는데 일반 고객이면 그대로 price로 지불할 거고
		 * 우수고객이면 price에 할인율을 곱해야한다. 
		 * 우수 고객의 지불 비용을 계산할 때 사용하기 위해 price를 return하도록 하였다.
		 * */ 
	}

	
		
	
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName +"님의 등급은 "+ customerGrade +"이며, 보너스 포인트는 "+bonusPoint+" 입니다.";
	}

	
}
