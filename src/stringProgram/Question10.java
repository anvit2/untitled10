package stringProgram;

import java.util.Scanner;

public class Question10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String Input = sc.nextLine();
            System.out.println("Enter the variable");
            String varInput = sc.next();
            System.out.println("index of variable:- " + Input.indexOf(varInput));
        }
    }