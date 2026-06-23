package operator;
// 해당 파일의 폴더명 , 기재해야 오류 X

public class Operator2 {
    public static void main (String[] args) {
        // String args[ ]는 c언어 문법

        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a+b = " + 10;
        System.out.println(result3);

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        /**
         문자열과 숫자를 더하면 숫자를 문자열로 변경한 다음에 합한다.
        > 문자열에 더하는것은 다 문자열
         **/


    }
}
