public class 반복문 {
    public static void main(String[] args){

       //for(초기값 ; 조건식 ; 증감식)
        int sum = 0;
        for( int i = 0; i<10; i++){
            sum += (i+1);
        }
        System.out.println(sum);

      // for - each문  (:)  배열 혹은 컬렉션에 있는 각각의 원소들을 저장할 때 사용하는 방법

        String[] daylist = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : daylist) {
            System.out.println(day);
        }


      // while(조건식){ 실행 코드 블럭 }

      int i =0;
      int sum1 = 0;
      while(i<10){
          sum1 += (i+1);
          i++;
          if(i==5){
              break;
          }
      }
      System.out.println(sum1);
    }
}
