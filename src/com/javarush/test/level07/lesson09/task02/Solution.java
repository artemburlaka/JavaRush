package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        String temp;

        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        //System.out.println("list.size() = " + list.size());

        for (int i = 0; i < 5; i++)
        {
            temp = list.get(list.size()-i-1);
            list.remove(list.size() - i - 1);
            list.add(list.get(i));
            list.add(i,temp);
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
