public class CheckGreater {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 45;
        c = 40;

        if(a > b && a > c) {
            System.out.println("A");
        }
        else if (b > c) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}