package ch15;

public class Taxi {
	String taxiName;
	int income;
	int fee;
	
	public Taxi(String taxiName,int fee) {
		this.taxiName = taxiName;
		this.fee = fee;
		
	}
	
	public void taxiIncome(int income) {
		this.income += income;
		
	}
	

	
	public void taxiInfo() {
		System.out.println(taxiName+"택시 수입은 "+income+"원 입니다.");
	}
}
