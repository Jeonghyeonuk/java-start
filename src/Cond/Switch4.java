package Cond;

public class Switch4 {
    public static void main(String[] args) {

        //Java 14 이상부터 사용 가능
        int grade =2 ;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 받은 쿠폰 : " + coupon);
    }
}
