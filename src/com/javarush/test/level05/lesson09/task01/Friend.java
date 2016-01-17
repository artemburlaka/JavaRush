package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendName = null;
    private int friendAge = 0;
    private String friendType = null;

    public Friend(String name)
    {
        this.friendName = name;
    }

    public Friend(String name, int age)
    {
        this.friendName = name;
        this.friendAge = age;
    }

    public Friend(String name, int age, String type)
    {
        this.friendName = name;
        this.friendAge = age;
        this.friendType = type;
    }

}