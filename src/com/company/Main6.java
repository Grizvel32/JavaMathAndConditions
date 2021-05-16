package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayOfWeek;

        System.out.print("input dayOfWeek: ");
        dayOfWeek = input.nextInt();

        switch (dayOfWeek)
        {
            case 1:
                System.out.println("Pn");
                break;
            case 2:
                System.out.println("Vt");
                break;
            case 3:
                System.out.println("Sr");
                break;
            case 4:
                System.out.println("Cht");
                break;
            case 5:
                System.out.println("Ptn");
                break;
            case 6:
                System.out.println("Sb");
                break;
            case 7:
                System.out.println("Vsk");
                break;
            default:
                System.out.println("Takogo dnya net");
                break;
        }
    }
}
