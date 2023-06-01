package scannerExamples;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 number: ");
        double a = sc.nextDouble();

        System.out.println("Enter 2 number: ");
        double b = sc.nextDouble();

        System.out.println("Result: " + Math.round(a * b));



        sc.close();
    }
}
