package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date();
        Date enterTime = new Date(date);

        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        yearStartTime.setYear(enterTime.getYear());

        long msTimeDistance = enterTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) ( (msTimeDistance/msDay) + 2); //количество целых дней
//        System.out.println("Days from start of year: " + dayCount);
        if (msTimeDistance < 0)
            return true;

        if (dayCount%2 == 1)
        return true;
        else return false;
    }
}
