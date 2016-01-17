package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int i = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int j = Integer.parseInt(num2);

       // int k = 1;
       // int l = 1;
        for(int k = 1; k <= i; k++)
        {
            for (int l = 1; l <= j; l++)
            {
                System.out.print("8");
            }
            System.out.println("");
        }

    }
}
