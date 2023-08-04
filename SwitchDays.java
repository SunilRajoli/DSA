/*
Given the Day number, print the Day name in lower case corresponding to it by using the help of switch statement.

Note: Day 1 - is monday.

If the day is not valid example 1> day >7 then print invalid
 */

public class SwitchDays {
    public static void main(String[] args) {
        int n = 5;
        switch (n) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3: 
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thrusday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid");
    }
    }
    
}
