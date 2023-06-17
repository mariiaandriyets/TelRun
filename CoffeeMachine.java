package Homework;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("напиток: (нажмите для: эспрессо - 1, американо - 2, капучино - 3, чай -4) ");
        byte drink = sc.nextByte();
        sc.close();

        switch (drink) {

            case 1:
                System.out.println("c");
                break;

            case 2:
                System.out.println("готовится американо: эспрессо + добавление воды");
                break;

            case 3:
                System.out.println("готовится капучино: эспрессо + добавление вспененного молока");
                break;

            case 4:
                System.out.println("готовится чай: вода + пакетик чая");
                break;

            default:
                System.out.println("под таким номером нет напитка");



        }

    }
}
