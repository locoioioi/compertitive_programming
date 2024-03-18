import java.util.Scanner;

public class questionA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        while (num > 1) {
            System.out.println(num);
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
        }
        System.out.println(num);
    }
}