package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

//        String s = " ksdjfn lijwdf cd";
        char[] list = s.toCharArray();
        boolean b = false;

        for (int i = 0; i < list.length; i++)
        {
            char a = ' ';
//            list[i] == a;
//            System.out.println(list[i]);
            if ((list[i] != a) && (b == false) ) {
                String n = "" + list[i];
                n = n.toUpperCase();
                s = s.substring(0,i) + n + s.substring(i+1,s.length());
                b = true;
            }
            else if (list[i] == a) {
                b = false;
            }
        }
        System.out.println(s);


    }


}
