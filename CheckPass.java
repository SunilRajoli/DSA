/*

Write a program to assume a value of marks and print whether a person has failed or passed using ternary Operator.

If Marks> =40 --> pass

ELSE ---> fail

 */

public class CheckPass {
    public static void main(String[] args) {
        int marks = 45;
        String c;
        c = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(c);
    }

}
