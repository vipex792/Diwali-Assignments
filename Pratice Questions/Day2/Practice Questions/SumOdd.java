import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = 1;  // first odd number

        for (int i = 1; i <= n; i++) {
            sum = sum + num;
            num = num + 2;  // next odd number
        }

        System.out.println("Sum of first " + n + " odd numbers = " + sum);
    }
}
