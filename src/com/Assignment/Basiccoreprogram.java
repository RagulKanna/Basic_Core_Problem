package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
    public static void main(String[] args) {
        Scanner y =new Scanner(System.in);
        System.out.println("Enter the year consist of four digit: ");
        int year =y.nextInt();
        if(year < 1000 || year > 9999)
        System.out.println("\nYou entered wrong year");
        else
        {
            if(year % 4 == 0)
                System.out.println("\nEntered year is Leap Year");
            else
                System.out.println("\nEntered year is not a Leap year");
        }

    }


}
