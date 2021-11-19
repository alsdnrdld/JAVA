public class 연산자 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);


        // [대입 연산자!!]

        /*
           '앞'+= '뒤'  : '앞'에  '앞'+'뒤'를 한 값을 할당해라
           '앞'-= '뒤'  : '앞'에  '앞'-'뒤'를 한 값을 할당해라
           '앞'*= '뒤'  : '앞'에  '앞'*'뒤'를 한 값을 할당해라
           '앞'/= '뒤'  : '앞'에  '앞'/'뒤'를 한 값(몫)을 할당해라
           '앞'%= '뒤'  : '앞'에  '앞'%'뒤'를 한 값을 할당해라 (나눈 나머지 값)
        * */

        num1 += num2; // num1 = num1 + num2
        System.out.println(num1);

        num1 -= num2; // num1 = num1 - num2
        System.out.println(num1);

        num1 *= num2; // num1 = num1 * num2
        System.out.println(num1);

        num1 /= num2; // num1 = num1 / num2
        System.out.println(num1);

        num1 %= num2; // num1 = num1 % num2
        System.out.println(num1);

    }
}
