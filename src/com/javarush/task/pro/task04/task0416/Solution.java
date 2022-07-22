package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();//напишите тут ваш код
        int people = scanner.nextInt();//напишите тут ваш код
        double result = (double) cola/people;
        System.out.println(result);
    }
}