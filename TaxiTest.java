package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		Passenger passengerE = new Passenger("Edward",20000);
		Passenger passengerK = new Passenger("Kim",15000);
		Taxi taxi = new Taxi("잘 간다 운수",10000);
		
		Taxi taxi2= new Taxi("완전싸 운수",3000);
		
		passengerE.takeTaxi(taxi);
		passengerK.takeTaxi(taxi);
		passengerE.takeTaxi(taxi2);
		passengerK.takeTaxi(taxi2);
		
		passengerK.passengerInfo();
		passengerE.passengerInfo();
		taxi.taxiInfo();
		taxi2.taxiInfo();
	}

}
