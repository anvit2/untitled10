package stringProgram;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        System.out.println("index of substring");
        int index=sc.nextInt();
        String a=input.substring(index);
        System.out.println("subString Value is "+a);


    }
}
