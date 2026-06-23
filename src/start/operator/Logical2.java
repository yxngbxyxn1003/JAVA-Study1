package operator;

// 변수 a 가 10 보다 크고 20보다 작은지 논리 연산자를 사용해서 확인

public class Logical2 {
    public static void main (String[] args){
        int a = 15;

        boolean result = a >= 10 && a < 20 ; //a가 10보다 크거나 같으면서도 20보다 작아야 true 그렇지 않으면 false
        System.out.println("result = " + result);

        /**
         * 좀더 가독성 있는 코드를 사용한다면 다음과 같으 작성한다.
        boolean result = 10 <= a && a < 20;
         **/
    }
}
