package Casting;

public class Casting1 {

    public static void main(String[] args) {
        // 작은 범위에서 큰 범위로 형변환은 자동으로 형 변환 된다

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double

        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);

    }


}
