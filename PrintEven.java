/*
Write a program using only while loops to print all the even numbers from 1 to n
 */
public class PrintEven {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        while(i <= n) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
