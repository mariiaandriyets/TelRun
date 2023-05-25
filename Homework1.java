package scannerExamples;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls decimal number: ");
        int q = sc.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(q));

        System.out.println("Octo: " + Integer.toOctalString(q));

        System.out.println("Hex: " + Integer.toHexString(q));


        sc.close();
    }
}
