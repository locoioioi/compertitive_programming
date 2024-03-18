import java.util.Scanner;

public class QuestionD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long trailingZeros = 0;
        while (n > 0) {
            n = n / 5;
            trailingZeros += n;
        }
        System.out.println(trailingZeros);
    }
}