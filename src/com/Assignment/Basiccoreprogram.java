package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
        public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the two number to swap them ");
        System.out.println("Enter the first number:");
        int num1 =y.nextInt();
        System.out.println("Enter the second number:");
        int num2 =y.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
                System.out.println("After swapping the first number is "+num1);
                System.out.println("After swapping the second number is "+num2);
        }
}
