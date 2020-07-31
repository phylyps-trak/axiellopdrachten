package com.company;

import java.util.HashMap;

public class Frequentie
{
    HashMap<String, Integer> tekstEnVoorkomst = new HashMap<String, Integer>();

    void checkDeTekst(String s)
    {
        String[] mijnArray = s.split(" ");
        int y = 0;
        for (int p = 0; p<mijnArray.length;p++)
        {
            int count = 0;
            for (int i = 0; i < mijnArray.length; i++)
            {
                if ((mijnArray[i]).equalsIgnoreCase(mijnArray[p]))
                {
                    count++;
                }
            }
        tekstEnVoorkomst.put(mijnArray[p], (+ count));
        }
        for (String i : tekstEnVoorkomst.keySet())
            {
                System.out.println("key: " + i + " value: " + tekstEnVoorkomst.get(i));
            }
    }
}