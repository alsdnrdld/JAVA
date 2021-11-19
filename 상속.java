class Animal{
    String name;
    public void cry(){
        System.out.println(name +"는 지금 질질 짜고 있어~");
    }
}

class Dog extends Animal{   // Animal 클래스를 상속받은 자식 클래스 Dog
    Dog(String name){
        this.name = name;    // cry 메서드를 따로 선언하지 않아도 부모클래스에 있으므로 cry를 사용 할 수 있다.
    }
    public void swim(){    // 거기에 부모에는 없는 새로운 메서드를 선언 하였으므로 cry, swim 두개의 결과를 도출 할 수 있게 된다.
        System.out.println(name+"는 수영을 하고 있어");
    }
}


public class 상속 {
    public static void main(String[] args){
        Dog dog = new Dog("뽀삐");
        dog.cry();
        dog.swim();

        Animal dog2 = new Dog("미미");
        dog2.cry();
        //dog2.swim();
        /** 비록 Dog로 인스턴스화 하였지만 (클래스를 객체화 하였지만) dog2의 타입은 Animal 타입!!
         *  Animal 클래스에 명시된 기능만을 사용 할 수 있으므로
         *  Animal 클래스에 정의 되어 있지 않은 swim은 사용 할 수 없다고 오류가 나오게 된다!!
         * */
    }

    // 상속 받을 때 오직 1개의 클래스만 상속 받을 수 있다!!!! 여러개 클래스 상속 못 받는다!!!
}
