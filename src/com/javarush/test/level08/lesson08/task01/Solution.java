package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        set.add("ларбуз");
        set.add("лбанан");
        set.add("лвишня");
        set.add("лгруша");
        set.add("лдыня");
        set.add("лежевика");
        set.add("лжень-шень");
        set.add("лземляника");
        set.add("лирис");
        set.add("лкартофель");
        set.add("лларбуз");
        set.add("ллбанан");
        set.add("ллвишня");
        set.add("лглруша");
        set.add("лдынля");
        set.add("лежлевика");
        set.add("лженьл-шень");
        set.add("лземлялника");
        set.add("лирлис");
        set.add("лкарлтофель");

        return set;
    }
}
