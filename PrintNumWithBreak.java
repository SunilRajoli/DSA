/*
Write a program to print all the numbers from 1 to n .If m is present in between the sequence then stop printing any other number and break out of the loop.
 */
public class PrintNumWithBreak {
    public static void main(String[] args) {
        int n = 20;
        int m = 7;
        for(int i = 0; i <= n; i++) {
            if(i == m) {
                break;
            }
            System.out.println(i);
        }
    }
}
