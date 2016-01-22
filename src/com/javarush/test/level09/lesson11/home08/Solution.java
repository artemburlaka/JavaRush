package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        Random rand = new Random();
        int[] array5 = new int[5];
        for (int i = 0; i < array5.length; i++)
        {
            array5[i] = rand.nextInt(50) + 1;
        }
        list.add(array5);

        int[] array2 = new int[2];
        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = rand.nextInt(50) + 1;
        }
        list.add(array2);

        int[] array4 = new int[4];
        for (int i = 0; i < array4.length; i++)
        {
            array4[i] = rand.nextInt(50) + 1;
        }
        list.add(array4);

        int[] array7 = new int[7];
        for (int i = 0; i < array7.length; i++)
        {
            array7[i] = rand.nextInt(50) + 1;
        }
        list.add(array7);

        int[] array0 = new int[0];
        list.add(array0);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
