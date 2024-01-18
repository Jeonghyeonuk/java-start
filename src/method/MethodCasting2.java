package method;

public class MethodCasting2 {

    public static void main(String[] args) {
       int number = 1;
       printNumber(number); // int 는 double로 자동 형변환 되기때문에 상관없음
    }

    public static void printNumber(double n) {

        System.out.println("n = " + n);
    }
}
