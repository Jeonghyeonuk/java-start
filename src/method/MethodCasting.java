package method;

public class MethodCasting {

    public static void main(String[] args) {
       double number = 1.5;
//       printNumber(number); // double을 int에 자동으로 형변환 해주지 않기떄문에 컴파일에러
       printNumber((int)number);
    }

    public static void printNumber(int n) {

        System.out.println("n = " + n);
    }
}
