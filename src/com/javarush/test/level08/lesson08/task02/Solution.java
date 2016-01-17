package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(8);
        set.add(0);
        set.add(-2);
        set.add(85);
        set.add(122);
        set.add(-45);
        set.add(34);
        set.add(1);
        set.add(-67);
        set.add(3);
        set.add(16);
        set.add(-8);
        set.add(6);
        set.add(7);
        set.add(13);
        set.add(96);
        set.add(97);
        set.add(46);
        set.add(-6);

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next() > 10) iterator.remove();
        }

        /*
        for (Integer num : set)
        {
            if (num > 10)
                set.remove(num);
        }
        */
        return set;

    }
}
