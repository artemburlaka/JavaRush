package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). 
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String name = "Павел";
        boolean sex = true;
        int age = 56;
     //   Human father = null;
      //  Human mother = null;
        Human gdad1 = new Human(name, sex, age, null, null);

        String name2 = "Катя";
        boolean sex2 = false;
        int age2 = 55;
    //    Human father2 = null;
    //    Human mother2 = null;
        Human gmom1 = new Human(name2, sex2, age2, null, null);

        String name3 = "Аня";
        boolean sex3 = true;
        int age3 = 21;
        Human father3 = gdad1;
        Human mother3 = gmom1;
        Human mother4 = new Human(name3, sex3, age3, father3, mother3);

        String name5 = "Павел2";
        boolean sex5 = true;
        int age5 = 57;
     //   Human father5 = null;
     //   Human mother5 = null;
        Human gdad5 = new Human(name5, sex5, age5, null, null);

        String name6 = "Катя2";
        boolean sex6 = false;
        int age6 = 56;
     //   Human father2 = null;
     //  Human mother2 = null;
        Human gmom6 = new Human(name6, sex6, age6, null, null);

        String name7 = "Vasyz";
        boolean sex7 = true;
        int age7 = 21;
        Human father7 = gdad5;
        Human mother7 = gmom6;
        Human father8 = new Human(name7, sex7, age7, father7, mother7);

        String name11 = "Vasyz1";
        boolean sex11 = true;
        int age11 = 1;
        Human father11 = father8;
        Human mother11 = mother4;
        Human son1 = new Human(name11, sex11, age11, father11, mother11);

        String name12 = "Vasyz2";
        boolean sex12 = true;
        int age12 = 2;
        Human father12 = father8;
        Human mother12 = mother4;
        Human son2 = new Human(name12, sex12, age12, father12, mother12);

        String name13 = "Vasyz3";
        boolean sex13 = true;
        int age13 = 3;
        Human father13 = father8;
        Human mother13 = mother4;
        Human son3 = new Human(name13, sex13, age13, father13, mother13);

        System.out.println(gdad1);
        System.out.println(gmom1);
        System.out.println(gdad5);
        System.out.println(gmom6);
        System.out.println(father8);
        System.out.println(mother4);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
