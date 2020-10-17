package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class number {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Input a number: ");
      int num = in.nextInt();
       int a = num % 10;
       int b = num / 100;
       int c = (num / 10) % 10;
       int d =a + b + c;
    System.out.printf("Your number: %d \n", d);
      in.close();
 }
}
