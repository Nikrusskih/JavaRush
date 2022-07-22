package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        if (N > 0)
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
        if (N % 2 == 0) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.println(arr[j]);
            }
        } else
            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k]);
            }
    }
}