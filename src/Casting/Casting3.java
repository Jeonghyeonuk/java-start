package Casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;

        int intValue = 0;

        // int 값을 넘기면 시계처럼 int의 가장 작은 범위부터 다시시작 한다 (overflow)
        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);
    }

}
