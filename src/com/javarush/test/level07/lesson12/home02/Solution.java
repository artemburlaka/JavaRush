package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int m = Integer.parseInt(s2);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++)
        {
            String s3 = reader.readLine();
            list.add(s3);
        }

        for (int i = 0; i < m; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
