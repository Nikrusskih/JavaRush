package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        array = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
