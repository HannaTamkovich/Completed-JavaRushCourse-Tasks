package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(new Date()));
    }
}
