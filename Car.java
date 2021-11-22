package ch19;

public class Car {
    private static int serialNum = 10000;
    private int carNum;
    
  // 1. 생성자  
    public Car() {
    	this.serialNum++;
    	this.carNum=serialNum;
    	/*
    	 * this.carNum++;
    	 * 이렇게 해버리면 생성 되자 마자 10001 그리고 다른 차가 생산( 다른 차 객체가 만들어지면)
    	 * 10002가 되고 정적 변수가 아니므로 모든 차는 다 처음인 번호+2의 값을(모두 같은번호) 가지게 된다.
    	 * 5번째 줄 carNum을 static으로 하면 처음 static에 초기화한 값에 새로운 car 인스턴스를 할때마다 1이 더해지고 
    	 * 매번 1이 더해진 번호를 가지게 되며 공유를 하게 된다.
    	 * point carNum은 공유되어서는 안되므로 (각자 다른 값을 가져야 하므로) static을 하지 않는다!!
    	 * carNum은 순차적으로 +1이 더해지는 값들이 나와야 하므로 기준수를 static으로 만들어줘야 한다.
    	 * 기준수는 새로운 생성자가 만들어질때마다 1식 증가하고 공유하게 한다 그래야 순차적으로 증가된 값을 가지게 된다.
    	 * 공유 함으로써 증가하는 기준수를 차번호로 초기화 해주면 순차적으로 다른 차번호를 가지게 된다.
    	 * 
    	*/
    }
    
    
 //2. 메서드   
    public int getCarNum() {
    	return carNum;
    }
    
   
    
    
}
