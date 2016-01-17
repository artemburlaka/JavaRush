package com.javarush.test.level05.lesson12.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int intnum1 = Integer.parseInt(a);
        int intnum2 = Integer.parseInt(b);
        int sum = intnum1 + intnum2;
        System.out.println("Sum = " + sum);
    }
}

    /*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
for (int i = 1; ; i++)
        {

        String num1 = reader.readLine();
            */