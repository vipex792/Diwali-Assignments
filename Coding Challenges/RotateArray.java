import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (steps to rotate): ");
        int k = sc.nextInt();
        k = k % n; // handling large k values

        int[] rotated = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            rotated[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            rotated[j++] = arr[i];
        }

        System.out.println("Rotated Array:");
        for (int x : rotated)
            System.out.print(x + " ");
    }
}
