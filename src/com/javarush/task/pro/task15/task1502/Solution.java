package com.javarush.task.pro.task15.task1502;

import java.util.Scanner;

/* 
Возврат к истокам
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } finally {
            scanner.close();
        }
    }
}
