package loop;

/**
 * 기존 : i부터 하나씩 증가하는 수를 3번까지 더해라 (i ~ i + 2) 까지 -> i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ EndNum) 까지
 * ex) i = 1, endNum = 3 이라고 하면 1 ~ 3까지 총 3번 더해야 한다.
 */

public class While2_3 {
    public static void main(String[] args) {
        int i = 1;
        int EndNum = 3;
        int sum = 0;

        while(i <= EndNum) {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}