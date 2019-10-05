package stringProgram;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Input = sc.nextLine();
        int tweight = 0;
        int length = Input.length();
        for (int i = 0; i < length; i++) {
            int weight = (int) Input.charAt(i);
            tweight = tweight + weight;}
        System.out.print("TOTAL WEIGHT :-" + tweight);

    }
}
