package stringProgram;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Input = sc.nextLine();
        System.out.println("Enter the next string");
        String nextInput = sc.nextLine();
        System.out.println("Enter the variable to be replaced");
        String varInput = sc.nextLine();
        String a = Input.replace(nextInput, varInput);
        System.out.println("New String : " + a);

    }
}
