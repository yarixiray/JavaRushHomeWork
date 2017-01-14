package com.javarush.test.level09.lesson11.bonus03;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Examples
{
    public static void main(String[] args)
    {
        { int i; for(i=0; i<10; i++)
            switch (i) {
                case 0: System.out.println ("i is zero");
            break;
                case 1: System.out.println("i is one");
                    break;
                case 2: System.out.println("i is two"); break;
                case 3: System.out.println("i is three");
            break;
                case 4 : System.out.println("i is four");
                    break;
                default: System.out.println("i is five or more"); } }
    }
}
