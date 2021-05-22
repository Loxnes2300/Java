package com.company;

import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i, j, f;
        int last = 0;
        int k=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva: ");
        int x = in.nextInt();

        int []mas = new int[x];
        f=x-1;
        Random random = new Random();

        for(i = 0; i < x; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for(i=0; i<x; i++) {
            if(mas[i]!= 0)  {
                mas[last++] = mas[i];
            }
            else k++;
        }
        for( i=last; i<x; i++) {
            mas[i]=0;
        }

        if(k!=0) {
            k --;
            for(j=0; j<=k; j++) {
                for(i=f; i>=1; i--)     {
                    mas[i] = mas[i-1];
                }
                mas[0]=0;           }

        }



        for(i = 0; i < x; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}