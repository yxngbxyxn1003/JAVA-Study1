package loop;

/** 문제 : 1부터 하나씩 증가하는 수를 3번 더해라 (1 ~ 3 더하기)
 * 이 문제는 1부터 하나씩 증가하는 수이기 때문에 1 + 2 + 3을 더해야 한다.
   우선 while 문을 사용하지 않고 단순하게 작성해볼 것
 */
public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1;
        System.out.println("i = " + 1 + " sum=" + sum);

        sum = sum + 2;
        System.out.println("i = " + 1 + " sum=" + sum);

        sum = sum + 3;
        System.out.println("i = " + 1 + " sum=" + sum);
    }
}
