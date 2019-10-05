package stringProgram;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("String inputString = ");
        String input = sc.nextLine();
        System.out.printf("enter the variable ");

        String var = sc.nextLine();
        for (int i = 0; i <input.length() ; i++){
            if (input.charAt(i) == var.charAt(0)){
                System.out.println(i);
            }}}
}
