package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
        public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter three numbers to find greatest");
                System.out.println("Enter first number");
        int n1= y.nextInt();
                System.out.println("Enter Second number");
        int n2= y.nextInt();
                System.out.println("Enter third number");
        int n3= y.nextInt();
        if(n1>n2 && n1>n3)
                 System.out.println("The Number "+ n1 +"  is Largest among Three number");
        else if(n2>n3)
                System.out.println("The Number "+ n2 +"  is Largest among Three number");
        else
                System.out.println("The Number "+ n3 +"  is Largest among Three number");
        }
}
