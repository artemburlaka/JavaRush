package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < abcArray.length; i++)
        {
            count.add(0);
        }

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.get(i).length(); j++)
            {
                for (int k = 0; k < alphabet.size(); k++)
                {
                    char a1 = list.get(i).charAt(j);
                    char a2 = alphabet.get(k);
                    if (a1 == a2)
                    {
                        count.add(k,(count.get(k)+1));
                    }
                }
            }
        }

//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.get(1).length() = " + list.get(1).length());
//        System.out.println("alphabet.size() = " + alphabet.size());

        for (int i = 0; i < alphabet.size(); i++)
        {
            System.out.println(alphabet.get(i) + " " + count.get(i) );
        }
    }

}
