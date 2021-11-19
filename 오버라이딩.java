 /* 오버라이딩이란?
  * 부모 클래스로부터 상속 받은 메서드를 자식 클래스에서 다시 정의
  * 부모로 부터 상속 받은 메서드를 자신의 메서드로 덮어버리는 것
  **/


public class 오버라이딩 {
    public static void main(String [] args){

        Animal2 dog  = new Dog2("뽀삐");  // 부모의 것을 오버라이딩 한 경우 오버라이딩한 것만을 수행한다.
        dog.cry();
    }
}


class Animal2{
    String name;
    String color;

    public Animal2(String name){
        this.name = name;
    }
    public void cry(){
        System.out.println(name +" 는 울고 있어");
    }
}

class Dog2 extends Animal2{
    public Dog2(String name) {
        super(name);
    }
    public void  cry(){
        System.out.println(name + "는 시끄럽게 짖고 있어 개 소리좀 안나게 해라!!!!!");

    }
}