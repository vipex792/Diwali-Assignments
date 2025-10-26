import java.util.Scanner;

public class AlphanumericCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isAlphanumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z') ||
                  (ch >= '0' && ch <= '9'))) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("✅ String is alphanumeric");
        else
            System.out.println("❌ String is NOT alphanumeric");
    }
}
