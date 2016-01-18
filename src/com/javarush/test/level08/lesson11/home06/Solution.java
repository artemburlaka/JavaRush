package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> childAL1 = new ArrayList<Human>();
        Human child1 = new Human("child1", true, 3, childAL1);
        ArrayList<Human> childAL2 = new ArrayList<Human>();
        Human child2 = new Human("child2", false, 4, childAL2);
        ArrayList<Human> childAL3 = new ArrayList<Human>();
        Human child3 = new Human("child3", true, 5, childAL3);
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        ArrayList<Human> motherAL = new ArrayList<Human>();
        motherAL.add(child1);
        motherAL.add(child2);
        motherAL.add(child3);
        Human mother = new Human("mother", false, 25, motherAL);
        ArrayList<Human> fatherAL = new ArrayList<Human>();
        fatherAL.add(child1);
        fatherAL.add(child2);
        fatherAL.add(child3);
        Human father = new Human("father", true, 26, fatherAL);
        System.out.println(mother.toString());
        System.out.println(father.toString());

        ArrayList<Human> gmotherAL1 = new ArrayList<Human>();
        gmotherAL1.add(mother);
        Human gmother1 = new Human("gmother1", false, 52, gmotherAL1);
        ArrayList<Human> gfatherAL1 = new ArrayList<Human>();
        gfatherAL1.add(mother);
        Human gfather1 = new Human("gfather1", true, 53, gfatherAL1);
        System.out.println(gmother1.toString());
        System.out.println(gfather1.toString());

        ArrayList<Human> gmotherAL2 = new ArrayList<Human>();
        gmotherAL2.add(father);
        Human gmother2 = new Human("gmother2", false, 54, gmotherAL2);
        ArrayList<Human> gfatherAL2 = new ArrayList<Human>();
        gfatherAL2.add(father);
        Human gfather2 = new Human("gfather2", true, 55, gfatherAL2);
        System.out.println(gmother2.toString());
        System.out.println(gfather2.toString());



    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();


        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
