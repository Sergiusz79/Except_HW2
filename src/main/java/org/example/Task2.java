package org.example;


public class Task2 {

    public static void main(String[] args) {
//        То что было:
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

//        То что стало:
// Этот кусок кода я бы переделал так
// Вместо блока try-catch используем if
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        if (d != 0) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            throw new RuntimeException("Divide by zero not permitted");
        }
    }


}