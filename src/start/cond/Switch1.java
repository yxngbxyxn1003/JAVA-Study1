package cond;

/** 다음 문제를 if 문을 사용해서 작성해본다.
 * 문제 : 당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
 * 이 프로그램은 int grade 라는 변수를 사용하며, 회원등급(grade)에 따라 다음의 쿠폰을 발행해야 한다.
 * 1 등급 : 쿠폰 1000
 * 2 등급 : 쿠폰 2000
 * 3 등급 : 쿠폰 3000
 * 위의 등급이 아닐 경우 : 쿠폰 500
 *
 * 각 쿠폰이 할당된 후에는 "발급받은 쿠폰 " + 쿠폰 값 을 출력해야 한다.
 *
 * 2등급 사용자 출력 예)
 * 발급받은 쿠폰 : 2000
 */

// 내가 쓴 답변
public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        if (grade == 1) {
            System.out.println("발급받은 쿠폰 : " + 1000);
        } else if (grade == 2) {
            System.out.println("발급받은 쿠폰 : " + 2000);
        } else if (grade == 3) {
            System.out.println("발급받은 쿠폰 : " + 3000);
        } else {
            System.out.println("발급받은 쿠폰 : " + 500);
        }
    }
}

/** 권장 답변
 * public class Switch1 {
 *     public static void main(String[] args) {
 *         int grade = 2;
 *         int coupon;
 *
 *         if (grade == 1) {
 *             coupon = 1000;
 *         } else if (grade == 2) {
 *              coupon = 2000;
 *         } else if (grade == 3) {
 *              coupon = 3000;
 *         } else {
 *              coupon = 500;
 *         }
 *         System.out.println ("발급받은 쿠폰 : " + coupon);
 *     }
 * }
 */