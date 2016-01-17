package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    /*
    public static void main(String[] args)
    {
        HashMap<String, String> copy = createMap();
        removeTheFirstNameDuplicates(copy);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            System.out.println(pair.getKey()+" - "+ pair.getValue());
        }
    }
    */
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");
        map.put("2first", "Mama");
        map.put("2second", "Mila");
        map.put("2third", "Ramu");
        map.put("3first", "Mama");
        map.put("3second", "Mila");
        map.put("3third", "Ramu");
        map.put("4third", "Ramu1");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        /*
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            //String key = pair.getKey();
            String value = pair.getValue();
            while (iterator.hasNext())
            {
                Map.Entry<String, String> pair2 = iterator.next();
            }


        }
        */

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            String s = pair.getValue();
            int i = 0;
            for (Map.Entry<String, String> pair2: copy.entrySet())
            {
                if (pair2.getValue().equals(s))
                {
                    i++;

                }
                if (i>2)
                    for (Map.Entry<String, String> pair3: copy.entrySet())
                    {
                        if (pair3.getValue().equals(s))
                        {
                            i++;
                            map.remove(pair3.getKey());

                        }

                    }
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
