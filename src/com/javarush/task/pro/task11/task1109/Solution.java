package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer a = new Outer();
        Outer.Inner inner = a.new Inner();
        Outer.Nested nested = new Outer.Nested();

    }
}
