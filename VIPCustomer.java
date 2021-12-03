package ch02;


// Step2. 우수고객 클래스 만들기

/* VIP고객은 가격의 10%를 할인해 줌
 * 보너스 포인트 비율은 5%이다. 
 * 전문 상담원이 배정된다. 
 * */
public class VIPCustomer extends Customer {
	
		//	private int customerID;
		//	private String customerName;
		//	private String customerGrade;
		//	int bonusPoint;
		//	double bonusRatio;    ---->상속을 받으면 더 이상 이 부분을 코딩 안해도 됨 
	
	double salesRatio;
	String agentID;  //<--- 전문 상담원 ID
	
	
	public VIPCustomer() {
		customerGrade ="VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}


	public String getAgentID() {
		return agentID;
	}

	
	
}
