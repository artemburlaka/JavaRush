package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));


        String aS = reader.readLine();
    //    Solution aS = new Solution();
        int a = Integer.parseInt(aS);
        String bS = reader.readLine();
        int b = Integer.parseInt(bS);
        String cS = reader.readLine();
        int c = Integer.parseInt(cS);
        String dS = reader.readLine();
        int d = Integer.parseInt(dS);
        String eS = reader.readLine();
        int e = Integer.parseInt(eS);
     //   int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        int temp = 0;

     //   if ( min(a,b) < min(c,d) && min(a,b) < e )
     //       System.out.print( () );

        for (int i = 1; i <= 5; i++)
        {

            if ( max(a,b) == a )
            {
                temp = b;
                b = a;
                a = temp;
            }

            if ( max(b,c) == b )
            {
                temp = c;
                c = b;
                b = temp;
            }

            if ( max(c,d) == c )
            {
                temp = d;
                d = c;
                c = temp;
            }

            if ( max(d,e) == d )
            {
                temp = e;
                e = d;
                d = temp;
            }
            /*
            if (Integer.parseInt(aS) > Integer.parseInt(bS))
                zamena (aS,bS);
                //zamena1 ();
            System.out.println("1 = " + Integer.parseInt(aS));
            System.out.println("2 = "+ Integer.parseInt(bS));
            if (Integer.parseInt(bS) > Integer.parseInt(cS))
                zamena (bS,cS);
            System.out.println("2 = "+ Integer.parseInt(bS));
            System.out.println("3 = "+ Integer.parseInt(cS));
            if (Integer.parseInt(cS) > Integer.parseInt(dS))
                zamena (cS,dS);
            System.out.println("3 = "+ Integer.parseInt(cS));
            System.out.println("4 = "+ Integer.parseInt(dS));
            if (Integer.parseInt(dS) > Integer.parseInt(eS))
                zamena (dS,eS);
            System.out.println("4 = "+ Integer.parseInt(dS));
            System.out.println("5 = "+ Integer.parseInt(eS));
            */


        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /*
        System.out.println(Integer.parseInt(aS));
        System.out.println(Integer.parseInt(bS));
        System.out.println(Integer.parseInt(cS));
        System.out.println(Integer.parseInt(dS));
        System.out.println(Integer.parseInt(eS));
        */
    }

    /*
    public void curcle()
    {

    }


    public void zamena1()
    {

            String temp = bS;
            this.bS = this.aS;
            this.aS = temp;


    }
    */
    /*
    public static void zamena(Solution a, Solution b)
    {

            Solution temp = b;
            b = a;
            a = temp;


    }
    */

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }

    /*
    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    */
}
