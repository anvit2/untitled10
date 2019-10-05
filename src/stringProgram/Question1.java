package stringProgram;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int length = s.length();
        System.out.println("string Output");
        System.out.print("index : ");
        for (int i = 0; i < length ; i++) {
            System.out.printf("%5d",i);
        }
        System.out.print("\nchars : ");
        for (int i = 0; i < length ; i++) {
            System.out.printf("%5s",s.charAt(i));
        }
    }
}
