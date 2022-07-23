package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Nik", 5.0);
        grades.put("Lera", 5.0);
        grades.put("Nadya", 5.0);
        grades.put("Igor'", 5.0);
        grades.put("Olga", 5.0);
    }
}
