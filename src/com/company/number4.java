package com.company;
import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
         if(num > 0) {
             num++;
         } else if(num < 0) {
            int a = -2;
            num +=a;
        } else {
             num = 10;
         }
         System.out.printf("Your number: %d \n", num);
         in.close();
    }
}
