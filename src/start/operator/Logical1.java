package operator;

//논리 연산자는 boolean형 인 true와 false 를 비교하는데 사용

public class Logical1 {
    public static void main (String[] args) {

        System.out.println("&& : AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);


        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! : 반대로 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
