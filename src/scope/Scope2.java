package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; // m생존 시작
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + i);
            System.out.println("for i = " + i);
        }// i 사망
        System.out.println("main m = " + m);
    }// m 사망

}
