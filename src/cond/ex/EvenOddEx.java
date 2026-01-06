package cond.ex;

/**
 * 문제: 홀수 짝수 찾기
 * 정수 x가 주어지면 x가 짝수일 경우 "짝수"를 , x가 홀수일 경우 "홀수"를 출력하는 프로그램을 작성하라.
 * 삼항 연산자를 사용할 것
 */

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 20;


        String type = (x % 2 == 0) ? "짝수" : "홀수" ;

        System.out.println("x = " + x + " , " + type);
    }
}
