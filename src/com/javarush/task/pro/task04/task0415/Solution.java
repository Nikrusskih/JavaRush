package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        int radius = scanner.nextInt();
        double pi = 3.14;
        int result = (int) (pi * radius * radius);
        System.out.println(result);
    }
}