package study;
import java.util.*;
import study.Calculator; // import from package study

public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            String op = sc.next();

            int ans = Calculator.calculate(num1, num2, op);
            System.out.println("Result = " + ans);

        } catch (study.WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
