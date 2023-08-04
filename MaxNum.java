/*
Write a program to print the largest number of the two numbers given
 */
public class MaxNum {
    public static void find_Max(int a, int b) {
        if(a > b) {
            System.out.println("a is largest");
        }
        else {
            System.out.println("b is largest");
        }
    }
    public static void main(String[] args) {
        find_Max(25, 40);
    }
}
