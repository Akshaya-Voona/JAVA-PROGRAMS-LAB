/* wap to find the given number is palindrome */
public class test2 {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int rem, rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome");
        }
    }

}
