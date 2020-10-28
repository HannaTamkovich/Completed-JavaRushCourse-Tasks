package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        while (fileReader.ready()) {
            String[] words = fileReader.readLine().trim().split(" ");
            for (String word : words) {
                try {
                    Integer number = Integer.parseInt(word);
                    if (map.containsKey(number)) {
                        System.out.print(map.get(number) + " ");
                    } else {
                        System.out.print(number + " ");
                    }
                } catch (Exception e) {
                    System.out.print(word + " ");
                }
            }
            System.out.println();
        }
        fileReader.close();
    }
}
