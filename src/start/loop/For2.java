package loop;

// 문제 2 : i 부터 하나씩 증가하는 수를 endNum(마지막 수) 까지 더해라(i ~ endNum 더하기)
// for 분을 사용해 볼 것

public class For2 {
    public static void main(String[] args){
        int sum = 0;
        int EndNum = 10;

        for(int i = 1; i<=EndNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}