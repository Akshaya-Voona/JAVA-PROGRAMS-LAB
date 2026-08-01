
/*wap to print the sum of all the digitsof a given number */
import java.util.Scanner;

public class test3 {
    int rem, sum = 0, num;

    public void call() {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        test3 ob = new test3();
        ob.call();
    }
}
