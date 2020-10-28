package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerArrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return integerArrayList;
    }
}
