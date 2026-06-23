package operator;

//증감 연산자는 피 연산자 앞에 두거나 뒤로 둘 수 있으며 , 연산자의 위치에 따라 연산이 수행되는 시점이 달라진다.
// 전위 : ++a , 후위 : a++

public class OperatorAdd2 {
    public static void main(String[] args) {

        //전위 증감 사용자
        int a = 1 ;
        int b = 0 ;

        b = ++a ; // a의 값을 증가시키고 , 그 결과를 b에 대입
        System.out.println("a = " +a + " b = " + b);

        //후위 증감 사용자
        a = 1 ;
        b = 0 ;
        b = a++; // a의 현재 값을 b에 먼저 대입하고 , 그 후 a의 값을 증가시킴
        System.out.println("a = " + a + " , b = " + b);

        /**
         * 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에 , 본인의 값만 증가한다.
         * 따라서 전위이든 후위이든 둘 다 결과가 같다.
         * ++a = a++
         */
    }
}

