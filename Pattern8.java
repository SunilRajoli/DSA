public class Pattern8 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows - 1; i++) {
            for(int j = 1; j <= rows; j++) {
                if(i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        
            
            System.out.println();
        }
    }
}
