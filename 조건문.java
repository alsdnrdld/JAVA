public class 조건문 {
    public static void main(String[] args){
        int check = 100;
        int num1 = 150;

        if(num1>check){
            System.out.println("100보다 큰 수 입니다~");
        } else if(num1>50){
            System.out.println("50보다 큰 수 입니다. 100보다 작답니다.");
        }
        System.out.println("----------------------------------------------");
        char score ='F';
        switch (score){
            case 'A':
                System.out.println("A등급 축하합니다.");
                break;  //<---얘가 없으면 그냥 다 출력 되어버린다!! 꼭 넣어줘야 조건에 맞는 것만 출력된다.
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
                break;
            default:
                System.out.println("C보다 아래 등급이야 병신아.");
        }
        System.out.println("----------------------------------------------");

        // 삼항 연산자
        int a =5;
        String result = a<10 ? "10보다 작습니다.":"10보다 큽니다.";
        System.out.println(result);
    }
}
