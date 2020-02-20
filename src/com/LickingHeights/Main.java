package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//testOddness();
	//keepContained();
	lastDigit();
    }

    public static void testOddness() {
        int number;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Enter a positive integer.");
        number = keyboard.nextInt();

        System.out.println("Number is odd: " + (number % 2 != 0));
    }

    public static void keepContained(){
        int number;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Enter a positive integer.");
        number = keyboard.nextInt();

        System.out.println("Number contained is: " + (number%8+5));
    }

    public static void lastDigit(){
        int number;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Enter a positive integer with 4 digits.");
        number = keyboard.nextInt();

        System.out.println("The last digit of your number is: " + (number%10));
    }
}
