package com.company;
import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double y, log1, ac, k;


        Scanner in = new Scanner(System.in); //vvod
        System.out.print("Vvedite chislo: ");
        double x  = in.nextDouble();

        ac = pow(acos(pow(x,3)/ ( pow(x,3) +1)),3);//arccosinus
        k = pow(sqrt(abs(x) + 1 ),1/7);//koren'
        log1 = pow(log(log(pow(5,tan(x)) + pow(abs(x),sin(x))) / log(5)),2);//logarifm

        y = ac + k +  log1;//slojenie arccosinusa, korna i logarifma

        if((y >= 0) & (x>= 0 )& (pow(x,2) + pow(y,2) <= 25)) { //opredelyaet prenadlejnost' k pravoy verhney chasti kvadrata I k krugu
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}