package stringProgram;

import java.util.Scanner;

public class Question6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Input =sc.nextLine();
        String a= Input.toUpperCase();
        System.out.println("The new string is :"+ a);
    }
}
