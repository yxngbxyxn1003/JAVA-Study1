package cond;

public class Switch3 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon;

        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 : // 여기엔 break가 없으므로 중단하지 않고 case3으로 이동한다.
            case 3 :
                coupon = 3000; // 여기서 coupon = 3000; 코드를 실행하고 break를 만나서 switch 문을 빠져나간다.
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
