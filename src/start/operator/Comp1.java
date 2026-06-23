package operator;

// 비교 연산자는 참(true) 또는 거짓(false) 이라는 결과가 나온다. -> boolean 타입형 사용

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b); // != 는 불일치 연산자이지만 , !는 반대라는 뜻
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담기
        boolean result = a == b; //a == b : false
        // = : 대입연산자 / == : 동등한지 확인하는 비교 연산자
        System.out.println(result); // false

    }
}