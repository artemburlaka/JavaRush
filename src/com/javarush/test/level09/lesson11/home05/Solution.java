package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] charArray = s.toCharArray();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        char space = ' ';
        for (int i = 0; i < charArray.length; i++)
        {
            if (isVowel(charArray[i])) {
                list1.add(charArray[i]);
            }
            else if (charArray[i] == space) {
                //do nothing
            }
            else {
                list2.add(charArray[i]);
            }
        }
        for (int i = 0; i < list1.size(); i++)
        {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < list2.size(); i++)
        {
            System.out.print(list2.get(i) + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
