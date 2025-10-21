package variable;

public class Var8{
    public static void main(String[] args){

        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; //-32,768 ~ 32767
        int i = 2147483647; //-2147483648 ~ 2147483647

        //제일 긴 정수 넣을 수 있음 소문자 또는 대문자(권장) L을 넣어야 함
        long l = 9223372036854775807L; //-9223372036854775807 ~ 9223372036854775807

        //실수
        float f = 10.0f; //float 는 반드시 맨 뒤에 f 붙여야 함
        double d = 10.0; //double 이 훨씬 더 큰 범위의 실수 사용 가능
    }
}
