package com.company;
import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = Math.min(a, b);
        int minOne = Math.min(min, c);
        System.out.printf("Your number: %d \n", minOne);
        in.close();
    }
}
