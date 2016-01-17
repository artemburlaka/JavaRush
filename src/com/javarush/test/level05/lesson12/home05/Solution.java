package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.*;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; ; i++)
        {

            String num1 = reader.readLine();
            if (num1.equals("сумма"))
                break;

            else
            {
                int intnum1 = Integer.parseInt(num1);
                sum += intnum1;
            }

        }
        System.out.print(sum);
    }
}
