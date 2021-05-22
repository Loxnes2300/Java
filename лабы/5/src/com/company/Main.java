package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f = 1;
        int k = 0;
        int i = 0;
        int res = 0;
        String text = "19 + 5 - 13 =";
        String[] words = text.split(" ");//razdelenie stroki na znaki i chisla
        for (String word : words) {
            i++;
        }
        i=i/2;
        int[] num = new int[i]; //sozdanie massiva chisel


        for (k=0;k<i;k++){//zapolnenie massiva chisel
            num[k] = Integer.parseInt(words[k*2]);
        }

        i=i*2;
        res = num[0];

        for (k=1;k<i;k=k+2) {//opredelenie znaka
            if(words[k].equals("+")){
                res = res+num[f];
                f++;
            }else if (words[k].equals("-")){
                res = res-num[f];
                f++;
            }else if (words[k].equals("*")){
                res = res*num[f];
                f++;
            }else if (words[k].equals("/")){
                res = res/num[f];
                f++;
            }else if (words[k].equals("=")){//vivod yravneniya
                for (k=0;k<i;k++) {
                    if (k%2!=0) {
                        System.out.print(words[k] + " ");
                    } else {
                        System.out.print(num[k/2] + " ");
                    }
                }
                System.out.println(res);//ohibka
            } else {
                System.out.println("Error");
            }

        }

    }
}