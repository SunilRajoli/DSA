public class Pattern5 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = 1; i <= rows - 1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int k = rows - 1; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
