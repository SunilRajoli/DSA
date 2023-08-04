/*
Given a variable D (distance) write a program to print the cost associated with it as shown in the image:-

        Distance                            Cost
        0 through 100                       5.00
        more than 100 but less than 500     8.00
        more than 500 but less than 1000    10.00
        more than 1000                      12.00

Input:-

D = 700

Output:-

10


 */

public class PrintCost {
    public static void print_cost(int distance) {
        if(distance >= 0 && distance <= 100) {
            System.out.println(5);
        }
        else if(distance > 100 && distance <= 500) {
            System.out.println(8);
        }
        else if(distance > 500 && distance <= 1000) {
            System.out.println(10);
        }
        else {
            System.out.println(12);
        }
    }
    public static void main(String[] args) {
        print_cost(290);
    }
}
