package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт Ӏ Java Syntax: 7 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Бум!");
    }
}
