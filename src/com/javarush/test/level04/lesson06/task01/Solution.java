package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int intnum1 = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int intnum2 = Integer.parseInt(num2);

        if (intnum1 < intnum2)
        System.out.print(intnum1);
        else System.out.print(intnum2);

    }
}