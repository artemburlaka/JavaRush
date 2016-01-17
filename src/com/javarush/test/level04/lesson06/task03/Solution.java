package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int intnum1 = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int intnum2 = Integer.parseInt(num2);
        String num3 = reader.readLine();
        int intnum3 = Integer.parseInt(num3);

        int max;
        int mid;
        int min;

        if ( (intnum1 > intnum2) && (intnum1 > intnum3) )
            max = intnum1;
        else if ( (intnum1 < intnum2) && (intnum2 > intnum3) )
            max = intnum2;
        else max = intnum3;

        if ( (intnum1 < intnum2) && (intnum1 < intnum3) )
            min = intnum1;
        else if ( (intnum1 > intnum2) && (intnum2 < intnum3) )
            min = intnum2;
        else min = intnum3;

        if ( (intnum1 < max) && (intnum1 > min) )
            mid = intnum1;
        else if ( (max > intnum2) && (intnum2 > min) )
            mid = intnum2;
        else mid = intnum3;



        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }


}
