package Casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //명시적 형 변환
        intValue = (int) doubleValue;

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
    }

}
