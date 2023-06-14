package Homework;

import java.util.Scanner;

public class if_elseHomework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter please number of month: (1 = January, 2 = February, etc.)");
        int month = sc.nextInt();
        sc.close();


        if (month < 3)
            System.out.println("winter");
        else if (month > 11)
            System.out.println("winter");
        else if (month == 3)
            System.out.println("spring");
        else if (month == 4)
            System.out.println("spring");
        else if (month == 5)
            System.out.println("spring");
        else if (month == 6)
            System.out.println("summer");
        else if (month == 7)
            System.out.println("summer");
        else if (month == 8)
            System.out.println("summer");
        else
            System.out.println("autumn");



    }
}
