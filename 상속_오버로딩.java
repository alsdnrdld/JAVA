 /* 오버로딩이란?
  * 한 class 안에서 같은 이름의 메서드를 여러개 가지고 있는것.
  * 이름이 같다고 무조건 오버로딩이 되는 것은 아니다
  * 오버로딩이기 위한 조건들
  *   1. 메서드의 이름이 동일 할 것
  *   2. 매계변수의 갯수나 타입이 달라야 한다!!!
  * */



public class 상속_오버로딩 {

    public static void main(String[] args){

    }
    // 오버 로딩의 예
    int add(int x,int y, int z){
        return x+y+z;
    }

   /** long add(int a, int b, int c){
        return a+b+c;
    }*/ //<-- 매계변수의 타입과 갯수 그리고 메서드의 이름까지 모두 같으므로 오류가 뜨게 된다.

    int add ( int a, int b){
        return  a+b ;
    }

    int add ( int a, int b, long c){
        return  a+b;
    }


}

