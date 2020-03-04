package com.telan.project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!\nMaster");
        int a = 10;
        System.out.println(a);
        System.out.println(a + " This is number " + a);
        System.out.println("a " + a);
        System.out.println(a + a);
        float f = 3.15f;
        long b = 12134465877l;

        boolean boo = (2 + 5) > (3 * 10);
        System.out.println(boo);

        int height = 158;

        if (height > 200) {
            System.out.println("Go to Circus");
        } else if (height < 150) {
            System.out.println("Go to school");
        } else {
            System.out.println("Go to work");
        }

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        army(age);

        scanner.close();

        //powerXY(3, 3);
        //fan(2);

    }

    //возведение числа в степень
    private static void powerXY(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;   // res = 1*3 => res становится 3 и тд, res = 3*3, res = 9*3
        }
        System.out.println("Power is " + res);
    }

    private static void fan(int mode) {
        switch (mode) {
            case 0:
                System.out.println("Fan is off");
                break;
            case 1:
                System.out.println("Fan is min");
                break;
            case 2:
                System.out.println("Fan is high");
                break;
            default:
                System.out.println("Wrong mode");
        }
    }

        private static void army(int age) {

        if (age < 18) {
            System.out.println("Go to school");
        } else if (age >= 18 && age <= 27) {
            System.out.println("Go to army");
        } else {
            System.out.println("Go to home");
        }


    }
    }
