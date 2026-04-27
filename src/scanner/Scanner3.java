package scanner;

import java.util.Scanner;

// 사용자로부터 두개의 정수를 입력받고 크기 비교
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요. : ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.print("더 큰 숫자 : " + num1);
        } else if (num2 > num1) {
            System.out.print("더 큰 숫자 : " + num2);
        } else System.out.print("두 숫자는 같습니다.");
    }
}
