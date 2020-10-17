package com.company;

import java.util.Scanner;

public class number7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entry: ");
        int num = in.nextInt();
        double one;
        String[] myCity  =  {"Москва", "Ростов", "Краснодар", "Киров"};
        double[] myPrice = {4.15, 1.98, 2.69, 5.00};
        int sumPrice = 10;
        int a = 905;
        int b = 194;
        int c = 491;
        int d = 800;
       if(num == a) {
           one = myPrice[0] * sumPrice;
           String.valueOf(one);
           System.out.print(myCity[0]);
           System.out.print(" Стоимость звонка :");
           System.out.print(one);
       }
        else if(num == b) {
            one = myPrice[1] * sumPrice;
            String.valueOf(one);
            System.out.print(myCity[1]);
            System.out.print(" Стоимость звонка :");
            System.out.print(one);
        }  else if(num == c) {
           one = myPrice[2] * sumPrice;
           String.valueOf(one);
           System.out.print(myCity[2]);
           System.out.print(" Стоимость звонка :");
           System.out.print(one);
       }  else if(num == d) {
           one = myPrice[3] * sumPrice;
           String.valueOf(one);
           System.out.print(myCity[3]);
           System.out.print(" Стоимость звонка :");
           System.out.print(one);
       }
    }
}
