package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        String s1 = "1";
        list.add(s1);
        String s2 = "2";
        list.add(s2);
        String s3 = "3";
        list.add(s3);
        String s4 = "4";
        list.add(s4);
        String s5 = "5";
        list.add(s5);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
