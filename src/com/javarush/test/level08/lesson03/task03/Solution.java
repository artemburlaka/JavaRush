package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {

        HashMap<String, Cat> map2 = new HashMap<String, Cat>();
        for(String s: cats)
        {
            map2.put(s, new Cat(s));
        }
        /*
        Cat cat0 = new Cat(cats[0]);
        map2.put(cats[0], cat0);
        Cat cat1 = new Cat(cats[1]);
        map2.put(cats[1], cat1);
        Cat cat2 = new Cat(cats[2]);
        map2.put(cats[2], cat2);
        Cat cat3 = new Cat(cats[3]);
        map2.put(cats[3], cat3);
        Cat cat4 = new Cat(cats[4]);
        map2.put(cats[4], cat4);
        Cat cat5 = new Cat(cats[5]);
        map2.put(cats[5], cat5);
        Cat cat6 = new Cat(cats[6]);
        map2.put(cats[6], cat6);
        Cat cat7 = new Cat(cats[7]);
        map2.put(cats[7], cat7);
        Cat cat8 = new Cat(cats[8]);
        map2.put(cats[8], cat8);
        Cat cat9 = new Cat(cats[9]);
        map2.put(cats[9], cat9);
        */


        return map2;
    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
