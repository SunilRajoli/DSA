/*
Print the following series using for loop:-

1,8,27,64,125,216,......n
 */
public class PrintSeriesLoop {
    public static void main(String[] args) {
        int n = 125;
        for(int i = 1; i*i*i <= n; i++) {
            System.out.println(i*i*i);
        }
    }
}
