package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayOfWeek;

        System.out.print("input dayOfWeek: ");
        dayOfWeek = input.nextInt();

        if (dayOfWeek == 1)
        {
            System.out.println("Pn");
        }
        else if (dayOfWeek ==2)
        {
            System.out.println("Vt");
        }
        else if (dayOfWeek ==3)
        {
            System.out.println("Sr");
        }
        else if (dayOfWeek ==4)
        {
            System.out.println("Cht");
        }
        else if (dayOfWeek ==5)
        {
            System.out.println("Ptn");
        }
        else if (dayOfWeek ==6)
        {
            System.out.println("Sb");
        }
        else if (dayOfWeek ==7)
        {
            System.out.println("Vsk");
        }
        else
        {
            System.out.println("Takogo dnya netu");
        }
    }
}
