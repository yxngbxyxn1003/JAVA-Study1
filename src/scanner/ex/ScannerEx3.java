package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        Scanner multiplication = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요. : ");

        int num = multiplication.nextInt();

        System.out.println(num +"단의 구구단 : ");

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }
}
