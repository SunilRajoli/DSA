/*
By using while loop and continue statement

Print all number from 1 to n but then it should not be divisible by 5
 */
public class ExceptFiveMultiples {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        while(i <= n) {
            if(i%5 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
