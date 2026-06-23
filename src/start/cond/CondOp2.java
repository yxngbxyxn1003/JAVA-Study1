package cond;

// 단순히 참과 거짓에 따라서 특정 값을 구하는 경우 삼항 연산자 또는 조건 연산자라고 불리는 ?: 연산자를 사용할 수 있다.
// ?: 연산자 사용시 if 문과 비교해서 코드를 단순화 할 수 있다.

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;

        String status = (age >=18) ? "성인" : "미성년자" ; // (조건) ? 참_표현식 : 거짓_표현식
        System.out.println("age = " + age + " status = " + status);
    }
}
