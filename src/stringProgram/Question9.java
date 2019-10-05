package stringProgram;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Input = sc.nextLine();
        int tweight = 0;
        int upperweight = 0;
        int lowerweight = 0;
        int length = Input.length();
        for (int i = 0; i < length; i++) {
            if (Input.charAt(i) >= 'A' && Input.charAt(i) <= 'Z') {
                int weight = (int) Input.charAt(i);
                upperweight = upperweight + weight;

            }
            if (Input.charAt(i) >= 'a' && Input.charAt(i) <= 'z') {
                int lweight = (int) Input.charAt(i);
                lowerweight = lowerweight + lweight;

            }
        }
        tweight = upperweight - lowerweight;
        System.out.println("weight of upper character" + tweight);
    }
}
