package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("input number: ");
        number = input.nextInt();

        //todo calculate and print sum of digits
        int digit1 = number/100; // first digit
        int digit2 = (number%100)/10;
        int digit3 = number%10; // last digit

        System.out.println("digit1 = "+ digit1);
        System.out.println("digit2 = "+ digit2);
        System.out.println("digit3 = "+ digit3);

        int sum = digit1 + digit2 + digit3;

        System.out.println("sum "+ sum);

    }
}
