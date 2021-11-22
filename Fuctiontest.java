package ch03;

public class Fuctiontest {

	
	
	public static int addNum(int num1, int num2) {
		int result = 0;
		result = num1+num2;
		return result;
	}
	
	
	public static void sayHello(String greeting){
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		for(i=0;i<=100;i++) {
			sum +=i;
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		int n1= 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		System.out.println(total);
		
		sayHello("안녕하세요?");
		System.out.println(total);
		
		total = calcSum();
		System.out.println(total);
		
	}

}
/*   <스택 메모리>   heap메모리 영역과는 다른 개념이므로 기억해 둘 것!
 * 함수가 호출 될때 생성되었다가 함수가 기능을 다 하면 자동으로
 * 사라지는 메모리 영역 함수에서 사용하는 지역변수들이 자리를 잡았다가
 * 사라진다.
 * */
 

/*함수와 메서드의 차이는?
 * 함수는 어디에 얽매이지 않은 것 단독 모듈이고  사용하고 싶으면 함수만 호출 해서 쓰면 됨
 * 그리고 외부로부터 입력되는 값을 활용하여 값을 산출
 * 
 * 메서드는 클래스 안에 속해 있는 존재, 메서드가 속한 클래스에 정의된 멤버변수들을 활용해서 
 * 값을 산출 
 * 사용하고 싶으면 우선 클래스를 인스턴스 한다음 호출해서 사용해야한다.
 * */