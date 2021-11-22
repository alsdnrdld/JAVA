package ch15;

public class Passenger {
	String name;
	int money;
	
	public Passenger(String name,int money ) {
		 this.name = name;
		 this.money = money;
		
	}
	
	public void takeTaxi(Taxi taxi) { //먼저 Taxi taxi가 되어 있어야 한다!!
		taxi.taxiIncome(taxi.fee);
		this.money -= taxi.fee;
	}
	
	public void passengerInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
