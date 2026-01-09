package loop;

public class Continue1 {

    public static void main(String[] args) {
        // 문제 : 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.

        int i = 1;

        while (i <= 5) {
            if(i ==3) { // i = 3 인 경우 i를 하나 증가하고 continue를 실행한다. -> i를 출력하지 않고 while 조건식으로 이동
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
