package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
        public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the harmonic number  upto you needed: ");
        int num =y.nextInt();
        int constant=1;
        float value = 0.0f;
        for (int i=1;i<=num;i++)
        {
            value = value + (float) constant / i ;
        }
        System.out.println("For The Harmonic value of "+num+" is "+value);
    }
}
