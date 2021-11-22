package ch19;
/*
 *자동차 공장은 유일한 객체라고 했으므로 우선 자동차 공장 클래스를 싱글톤으로 해준다. 
 * */
public class CarFactory {
	
	private CarFactory(){}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
				return instance;
	}
	
	public Car createCar() {
		 Car car = new Car();
		return car; 
	}
	
}
