import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = 2;  // first even number

        for (int i = 1; i <= n; i++) {
            sum = sum + num;
            num = num + 2;  // next even number
        }

        System.out.println("Sum of first " + n + " even numbers = " + sum);
    }
}
