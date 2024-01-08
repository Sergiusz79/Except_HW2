package org.example;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(task1());

    }

    public static float task1() {
        Scanner scan = new Scanner(System.in);
        float f = 0f;
        boolean flag = true;
        while (flag) {
            System.out.println("Введите любое дробное число (разделитель - запятая): ");
            if (scan.hasNextFloat()) {
                f = scan.nextFloat();
                flag = false;
            } else {
                System.out.println("Введено неверное значение!!!\n    Ещё раз ");
                scan.next();
            }
        }
        return f;
    }
}