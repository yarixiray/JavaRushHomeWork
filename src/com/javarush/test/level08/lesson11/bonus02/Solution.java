package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        HashMap<String,String> slist = new HashMap<String, String>();
        String city;

        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            else {city = reader.readLine();}
            slist.put(family,city);
        }
        String questionCity=reader.readLine();
        for (Map.Entry<String,String> m:slist.entrySet()){
            if(m.getKey().equals(questionCity))
                System.out.println(m.getValue());


        }

    }
}
