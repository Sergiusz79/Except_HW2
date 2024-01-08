package org.example;


import java.io.FileNotFoundException;

public class Task3 {

    public static void main(String[] args) {
        //        То что было:
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (Throwable ex) { // Это исключение должно быть на последнем месте в нашем списке,
//                                      т.к. стоит на первом месте в иерархии исключений
//            System.out.println("Что-то пошло не так...");

//        } catch (NullPointerException ex) {  // Здесь не будет обращения к несуществующему объекту
//            System.out.println("Указатель не может указывать на null!");

//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }

//        То что стало:
// Этот кусок кода я бы переделал так
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

// Т.к. мы, в данном месте, не работаем с файлом то FileNotFoundException - "Файл не найден" здесь лишнее
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

// Этот кусок кода я бы переделал так
public static void printSum(Integer a, Integer b){
    System.out.println(a + b);
}

}