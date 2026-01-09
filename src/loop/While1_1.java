package loop;

// 1을 한번씩 더해서 총 3번 더하는 간단한 코드
public class While1_1 {
    public static void main(String[] args) {
        int count = 0;
        count += 1;

        System.out.println("현재 숫자는 : " + count);
        count = count + 1;

        System.out.println("현재 숫자는 : " + count);
        count = count + 1;

        System.out.println("현재 숫자는 : " + count);
        count = count + 1;

        //count = count + 1 은 증감연산자 ++를 사용해서 다음과 같이 개선 가능
        /**
         * count++;
           System.out.println("현재 숫자는 : " + count);
         */
    }
}