package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable  {
    public static class SubSolution extends Solution{

    }

    public static void main(String[] args) {

    }

    private void writeObject (ObjectOutputStream objectOutputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    private void readObject (ObjectInputStream objectInputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }
}
