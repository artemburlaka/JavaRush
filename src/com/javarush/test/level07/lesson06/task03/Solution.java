package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        String temp;
        int r = list.size()-1;

        for (int i = 0; i < 3; i++)
        {
            temp = list.get(i);
            list.remove(i);
            list.add(i, list.get(r - i - 1));
            list.remove(r - i);
            list.add(r-i, temp);
        }

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }





    }
}
