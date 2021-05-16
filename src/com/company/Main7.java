package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //на вход вводится кол-во ворон(целое)
        //ваша программа должна выдать правильное падеж
        // 1-ворона, 100001 - ворона
        // 4-вороны, 584 - вороны
        //switch

        int countOfRaven, lastDigit;

        System.out.print("Сколько на поле прилетело ворон ");

        Scanner input = new Scanner(System.in);
        countOfRaven = input.nextInt();

        if(countOfRaven>100 && ((countOfRaven%100)/10) == 1 ) {

                lastDigit = countOfRaven;
            }

        else {
            lastDigit = countOfRaven % 10;
        }

        switch (lastDigit) {

            case 1:

                    System.out.println("Ворона");
                    break;
             //   }
             //   else {


            case 2:
            case 3:
            case 4:
                System.out.println("Вороны");
                break;

            default:
                System.out.println("Ворон");
                break;

        }
    }
}
