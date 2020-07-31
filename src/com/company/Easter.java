package com.company;

import java.time.LocalDate;

public class Easter
{
    public LocalDate berekenPaasDatum(int y)
    {
        int maand = 0;
        int dag = 0;

        int c = y /100;
        int n = y - 19 * (y / 19);
        int k = (c - 17) / 25;
        int i = c - c / 4 - ((c - k ) / 3) + (19 * n) + 15;
        i = i -30 * (i / 30);
        i = i - (i / 28) * (1 - (i / 28) * (29 / (i + 1)) * ((21 - n) / 11));
        int j = y + (y / 4) + i + 2 - c + (c / 4);
        j = j - 7 * (j / 7);
        int L = i - j;
        int m = 3 + ((L + 40) / 44);
        int d = L + 28 - (31 * (m / 4));

        LocalDate paasDatum = LocalDate.of(y, m, d);
        return paasDatum;
        }
}

