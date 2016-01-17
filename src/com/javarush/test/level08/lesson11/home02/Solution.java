package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
//        System.out.println("==========");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++)
        {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        Set<Object> set = new HashSet<Object>();
        Iterator<Cat> iteratorCat = cats.iterator();
        while (iteratorCat.hasNext())
        {
            set.add(iteratorCat.next());
        }
        Iterator<Dog> iteratorDog = dogs.iterator();
        while (iteratorDog.hasNext())
        {
            set.add(iteratorDog.next());
        }
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
//        for (Object pet : pets) {
//            System.out.println(pet);
//        }

        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }
    public static class Dog {

    }
}
