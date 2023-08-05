/*
Write a program to print even numbers from 1 to n except numbers which are divisible by 4. 
 */

public class PrintEvenExceptFourMul {
    public static void main(String[] args) {
        int n = 25;
        for(int i = 2; i <= n; i = i + 2) {
            if(i%4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
