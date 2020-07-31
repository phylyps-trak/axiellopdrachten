package com.company;

import java.util.HashMap;

public class Frequentie
{
    HashMap<String, Integer> tekstEnVoorkomst = new HashMap<String, Integer>();

    void checkDeTekst(String s)
    {
        String[] mijnArray = s.split(" ");
        int y = 0;
        for (String value : mijnArray) {
            int count = 0;
            for (String item : mijnArray) {
                if (item.equalsIgnoreCase(value)) {
                    count++;
                }
            }
            tekstEnVoorkomst.put(value, (+count));
        }
        for (String i : tekstEnVoorkomst.keySet())
            {
                System.out.println("key: " + i + " value: " + tekstEnVoorkomst.get(i));
            }
    }
}