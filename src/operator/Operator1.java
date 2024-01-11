package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("sum = " + sum);

        int diff = a - b;
        System.out.println("diff = " + diff);
        
        int multi = a * b;
        System.out.println("multi = " + multi);

        int div = a / b; // int 라 소수점 날라감 
        System.out.println("div = " + div);
        
        // 나머지
        int mod = a % b;
        System.out.println("mod = " + mod);

    }
}
