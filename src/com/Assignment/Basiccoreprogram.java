package com.Assignment;

import java.util.Scanner;

public class Basiccoreprogram {
    public static int heads=0,tails=0;
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);

        System.out.println("Enter the positive value to flip a coin: ");
        int flip=c.nextInt();
        if (flip<0)
            System.out.println("You Entered Wrong value");
        else

            for(int i=0;i<flip;i++)
            {

                float coin= (float) Math.random();
                System.out.printf("\nThe Value of probability of flip of coin: "+"%.2f",coin);
                if( coin > 0.5 ) {
                    heads = heads + 1;

                }
                else
                    tails = tails + 1;

            }
            if(flip > 0) {
                System.out.println("\nThe no of Heads We get: " + heads);
                System.out.println("\nThe no of tails We get: " + tails);
                int Perhead = (heads * 100) / flip;
                int Pertail = (tails * 100) / flip;
                System.out.println("\nThe Head Percentage is :" + Perhead + "%");
                System.out.println("\nThe tail Percentage is :" + Pertail + "%");
            }
    }
}
