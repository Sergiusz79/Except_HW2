package org.example;


import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(checkEmptySpaceString(scan));

    }


    public static String checkEmptySpaceString(Scanner scan) {
        System.out.println("Введите значение");
        String str = scan.nextLine();
        if (str.isEmpty()) {
            throw new NullPointerException("Пустые строки вводить нельзя!!!");
        }

        char[] characters = str.toCharArray();
        int count = 0;
        for (char ch : characters) {
            if (Character.isSpaceChar(ch)) {
                count++;
            }
        }
        System.out.println("characters.length=" + characters.length);
        System.out.println("count=" + count);
        if ((characters.length == count)) {
            throw new RuntimeException("Строка целиком состоит из пробелов!");
        }
        return str;
    }
}

