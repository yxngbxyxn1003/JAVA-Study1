package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while(count < 3) {
            count++;
            System.out.println("현재 숫자는 : " + count);
        }
    }
}

/**
 * while (count < 3) 에서 코드 블럭을 반복 실행한다. 여기서 count 값이 1,2,3 으로 점점
   커지다가 결국 count < 3이 거짓이 되면서 while 문을 빠져나간다.

 * 만약 3 이 아니라 100이었다면 100번 반복하는 것!!
 */