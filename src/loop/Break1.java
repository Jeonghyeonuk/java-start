package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum = sum + i;
            if (sum > 1000000) {
                System.out.println("i = " + i);
                System.out.println("sum = " + sum);
                break;
            }
            i++;
        }
    }
}
