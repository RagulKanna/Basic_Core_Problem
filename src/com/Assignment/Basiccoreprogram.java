package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
    public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the power of 2 upto you needed: ");
        int pow =y.nextInt();
        int value;
        for (int i=1;i<=pow;i++)
        {
            value=(int)Math.pow(i,2);
            System.out.println("\n The value of 2 power "+i+" is "+value);
        }

    }


}
