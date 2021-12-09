package ch10;
//템플릿 메서드 예제

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.~");
		
		
	}

	@Override
	public void wiper() {
		// 재정의를 했지만 내용이 없으므로 출력이 안나온다.
	}

}
