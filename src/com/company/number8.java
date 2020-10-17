package com.company;

public class number8 {

    public static void main(String[] args) {
        int[] myNumbers = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = myNumbers[0];
        int sum = myNumbers[0];

        for(int i = 0; i < myNumbers.length; i++) {
            max = Math.max(max, myNumbers[i]);
        }
        System.out.print(max);
        for(int j = 0; j < myNumbers.length; j++) {
             if(myNumbers[j] > 0) {
                  sum += myNumbers[j];
             } else {
                 return;
             }
        }
        System.out.print(sum);

    } }
