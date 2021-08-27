package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
        public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the number to find quotient and remainder ");
        int num =y.nextInt();
        System.out.println("Enter the divisor: ");
        int div =y.nextInt();
        int quotient=num / div;
        int remainder=num % div;
        System.out.println("The Quotient of the number is "+quotient);
        System.out.println("The Remainder of the number is "+remainder);
        }
}
