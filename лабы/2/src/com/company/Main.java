package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float y = 0;

        Scanner in = new Scanner(System.in);//Vvod
        System.out.print("Vvedite х: ");
        float x = in.nextFloat();

        if(x<=3){//1 yravnenie
            y = (float) log(abs(pow(2,x) + pow(x,7) + pow(abs(x-4),x)));
        }

        else if ((x>3)&(x<5)){//2 yravnenie
            y = (float) pow(log10(pow(x/(1+pow(x,2)),4)),9);
        }

        else {
            y = (float) acos(1/x) + 1;//2 yravnenie
        }

        System.out.println(y);
    }
}