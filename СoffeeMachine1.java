package Homework;

import java.util.Scanner;

public class СoffeeMachine1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("напиток: (нажмите для: эспрессо - 1, американо - 2, капучино - 3, чай -4) ");
        byte drink = sc.nextByte();
        sc.close();

       if (drink == 1)
           System.out.println("готовится эспрессо");
       else if (drink == 2)
           System.out.println("готовится американо: эспрессо + добавление воды");
       else if (drink == 3)
           System.out.println("готовится капучино: эспрессо + добавление вспененного молока");
       else if (drink == 4)
           System.out.println("готовится чай: вода + пакетик чая");
       else
           System.out.println("под этим номером нет напитка");




    }
}
