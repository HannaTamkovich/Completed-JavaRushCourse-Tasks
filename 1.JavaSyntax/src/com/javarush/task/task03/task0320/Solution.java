package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
