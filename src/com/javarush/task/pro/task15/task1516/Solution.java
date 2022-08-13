package com.javarush.task.pro.task15.task1516;

import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader);
       // String str = scanner.nextLine();
        while (true) {
            Path path = Path.of(scanner.nextLine());
            if (Files.isRegularFile(path)) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(path + THIS_IS_DIR);
            } else
                break;
        }
    }
}

