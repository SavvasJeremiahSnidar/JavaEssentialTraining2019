package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        float first = input.nextFloat();
        System.out.println("Enter a numeric value: ");
        float second = input.nextFloat();
        System.out.println("The answer is: " + (first / second));

    }
}
