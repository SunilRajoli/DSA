/*
Print the following series using while loop

1 4 9 16 25 36 …. n
 */
public class PrintSeries {
    public static void main(String[] args) {
        int i = 1;
        int n = 49;
        while(i*i <= n){ 
            System.out.println(i*i);
            i++;
        }
        
    }
}
