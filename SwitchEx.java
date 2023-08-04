public class SwitchEx {
    public static void main(String[] args) {
        int x = 2;
        switch(x) {
            case 1:
                System.out.println("Choice is 1");
                break;
            case 2:
                System.out.println("Choice is 2");
            case 3:
                System.out.println("Choice is 3");
            case 4: 
                System.out.println("Choice is 4");
                break;
            default:
                System.out.println("Choice other than 1, 2, 3, 4");
                break;
        }
    }
}
