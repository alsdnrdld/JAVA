package ch10;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public abstract void drive();
	public abstract void stop();
	public  void turnOff() {
		System.out.println("시동을 끕니다");
	}
	final public void run() { //<-- 템플릿 메서드 하위 클래스에서 재정의 할 수 없게 막은 것. 
		startCar();
		drive();
		stop();
		wiper();
		turnOff();
		washCar();
	}
	
	public abstract void wiper();
	public void washCar(){}  //<--- 구현이 된 메서드 추상 메서드 아님 내용이 없을 뿐.
	

	
}
