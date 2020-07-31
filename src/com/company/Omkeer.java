package com.company;

public class Omkeer {
    int[] arrayA;
    int[] arrayB;

    void draaiMaarOm( int [] A )
    {
    int x = A.length - 1;
    for(int y = 0; y < A.length; y++ )
        {
            arrayB[y] = A[x];
            x--;
        }
    }
}

