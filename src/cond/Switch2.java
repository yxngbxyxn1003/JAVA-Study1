package cond;

public class Switch2 {
    public static  void main (String[] args) {
        // 앞선 if 문으로 구성된 switch1 파일은 switch 구문으로 변경
        // switch 는 if문 과 달리 비교 연산자를 사용할 수 없고 단순히 값이 같은지만 비교할 수 있다.

        int grade = 2;
        int coupon;

        switch(grade) {
            case 1: // 조건식인 grade가 1 일때 실행되는 코드
                coupon = 1000;
                break;
            case 2 : // 조건식인 grade가 2 일때 실행되는 코드
                coupon = 2000;
                break;
            case 3 : // 조건식인 grade가 3 일때 실행되는 코드
                coupon = 3000;
                break;
            default: //조건식의 결과값이 위의 어떤 값에도 해당되지 않을 때 실행되는 코드
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
