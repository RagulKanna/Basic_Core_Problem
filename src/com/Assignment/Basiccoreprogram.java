package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
        public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the number to be factorize: ");
        int num =y.nextInt();
        System.out.println("Factor is ");
        for (int i=2;i<num;i++)
        {
                while(num%i==0) {
                        System.out.println(i);
                        num = num / i;
                }
                }
        if (num>2)
                System.out.println(num);
    }
}
