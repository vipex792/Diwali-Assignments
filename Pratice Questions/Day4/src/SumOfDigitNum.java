import java.util.Scanner;

public class SumOfDigitNum {
    public static  void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n= n/10;

        }
        System.out.println("Sum of digits = "+ sum);
    }

}
