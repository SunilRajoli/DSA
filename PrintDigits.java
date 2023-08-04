/*
Write a program to print the digits of a number 
 */
public class PrintDigits {
    public static void main(String[] args) {
        int n = 153;
        while(n > 0) {
            int r = n%10;
            System.out.println(r);
            n = n/10;
        }
    }
}
