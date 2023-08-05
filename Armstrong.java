/*
Write a program to print whether a given number is an Armstrong number or not..
 */
public class Armstrong {
    public static void main(String[] args) {
        int num = 585;
        int temp;
        temp = num;
        int r, sum = 0;

        while(temp > 0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
            
        }
        if(temp == sum) {
            System.out.println("Given Number is Armstrong Number");
        }
        else {
            System.out.println("Given Number is not an Armstrong Number");
        }
    }
}