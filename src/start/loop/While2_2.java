package loop;

/**
public class While2_2 {
    public static void main(String[] args) {
        // i부터 하나씩 증가하는 수를 3번 더해라

        int i = 1;
        int sum = 0;

        while(i < 4) {
            sum = sum + i;
            System.out.println("i : " + i + " sum = " + sum);
            i++;
        }
    }
}
**/

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;

        sum = sum + i;
        System.out.println("i= " + i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i= " + i + "sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i= " + i + "sum = " + sum);
        i++;

    }
}