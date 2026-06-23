package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {

        int count = 0;

        while(count < 10) {
            count++;
            System.out.println(count);

            // 아니면 초기값을 1로 잡고 count++를 출력문 앞에 써도 됨
        }
    }
}
