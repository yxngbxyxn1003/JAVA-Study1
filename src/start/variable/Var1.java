package variable;

public class Var1 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);

        // 같은 int 형 끼리 계산하면 계산 결과도 같은 int 형을 사용 -> int 형은 정수이기 때문에 소수점 이하 포함 X
        // 숫자는 0으로 나눌 수 없음 OR " Exception in thread " 오류 발생
    }
}