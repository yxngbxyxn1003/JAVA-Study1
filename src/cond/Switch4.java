package cond;


//switch 문을 사용한다고 매번 깔끔한 코드가 나오는것은 절대 X -> JAVA 14 부터는 이를 해결하고자 새로운 switch 문 정식 도입
public class Switch4 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon = switch(grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
/**
 * 기존 switch문과 차이
 * -> 사용
 * 선택된 데이터 반환 가능
 * 새로운 switch문은 더 많은 내용을 담고 있다. 지금 이해하기에 어려운 내용들이 있으므로, 자세한 내용은 추후에 추가
 */