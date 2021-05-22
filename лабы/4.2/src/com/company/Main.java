package com.company;

import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        boolean b = false;
        Scanner in = new Scanner(System.in);//Vvod dannih
        System.out.print("Vvedite 1 chislo razmera matrici: ");
        int x = in.nextInt();
        System.out.print("Vvedite 2 chislo razmera matrici: ");
        int y = in.nextInt();

        int [][]mas = new int[x][y];//Sozdanie massiva

        Random random = new Random();

        for(i = 0; i < x; i++) {//Zapolnenie massiva
            for (int k=0; k<y;k++){
                mas[i][k] = random.nextInt(100) -50;
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Vvedite minimalnuy diapazon: ");
        int minDip = in.nextInt();
        System.out.print("Vvedite maximalnuy diapazon: ");
        int maxDip = in.nextInt();

        for(i = 0; i < x; i++) {
            for (int k=0; k<y;k++){
                if((mas[i][k] > minDip &&(mas[i][k] < maxDip))){
                    mas[i][k] = 1;

                }
                else {
                    mas[i][k] = 0;

                }
                if (mas[i][k] == 1) {
                    b=true;
                }
            }
        }
        System.out.println(b);
    }
}