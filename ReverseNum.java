/*
Write a program to return the reverse of a number
 */
public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse Number is: " +rev);
    }
}
