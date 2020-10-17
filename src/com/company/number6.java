package com.company;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entry: ");
        int num = in.nextInt();
        String numbers = in.nextLine();
         if(num < 0) {
             if(num/2 != 0) {
            numbers = "отрицательное четное число";
             } else {
                 numbers = "отрицательное нечетное число";
             }
         } else if(num > 0) {
             if(num/2 != 0) {
                 numbers = "положительное четное число";
             } else {
                 numbers = "положительное нечетное число";
             }
         } else {
             numbers = "Нулевое число";
         }
        System.out.println(numbers);
         in.close();
    }
}
