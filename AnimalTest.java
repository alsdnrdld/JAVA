package ch06;

import java.util.ArrayList;

// 상속을 이용한 다형성


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}
}


class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷는다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}


class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수라가 양날개를 쭉 펴고 날아다닙니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Human();
		
		// move가 모두 재정의 되었으므로 재 정의된(overriding) 가상 메소드를 (각자의 자식 클래스에 재정의된 매소드를) 호출하여 각기 다른 값을 출력하게 된다. 
		// Animal에 아에 존재 하지 않는 것은 당연히 사용 할 수 없다. 타입이 Animal타입이므로 !!
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
	    System.out.println("\n --------------------------------------- \n");
		
		// 상속받은 자식클래스의 타입은 부모 클래스이다. 그래서 다음과 같이 부모클래스 타입으로 하여 ArrayList에 담을 수 있다. 
		ArrayList<Animal> animalList = new ArrayList<Animal>(); 
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();  //왜 전부 "동물이 움직입니다가 아니고 각자의 move의 값이 나오는 걸까?
			
			
			/*animal의 값은  hAnimal -> tAnima -> eAnimal 순으로 바뀐 다 즉,
			 * hAnimal.move() -> tAnimal.move() -> eAnimal.move() 순으로 출력이 되는 것이다.
			 * */ 
		}
		

	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
