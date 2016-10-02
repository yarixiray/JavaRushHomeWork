package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("ds");
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Daesfgdg","Khfghfhfh");
        map.put("Daesfgdga","Khfghfhfh");
        map.put("Daesfgdgs","Khfghfhfh");
        map.put("Daesfgdgd","Khfghfhfh");
        map.put("Daesfgdg","Khfghfhfh");

        map.put("Daesfgdgawe","Khfghfhfh");
        map.put("Daesfgdgswee","Khfghfhfh");
        map.put("Daesfgdgdweee","Khfghfhfh");
        map.put("Daesfgdgweee","Khfghfhfh");
        map.put("Daesfgdgaewewewe","Khfghfhfh");

        return map;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String> copyMap = new HashMap<String, String>();
        Set<Object> uniqValues = new HashSet<Object>(map.values());

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
