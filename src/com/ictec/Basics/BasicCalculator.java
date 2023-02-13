package com.ictec.Basics;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double a,b, output;
        boolean bool = true;
        char choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Basic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose a option:");
            choice = input.next().charAt(0);
            switch (choice) {
                case '1' -> {
                    System.out.print("Enter the first number:");
                    a = input.nextDouble();
                    System.out.print("Enter the second number:");
                    b = input.nextDouble();
                    output = a + b;
                    System.out.println("Answer = " + output);
                }
                case '2' -> {
                    System.out.print("Enter the first number:");
                    a = input.nextDouble();
                    System.out.print("Enter the second number:");
                    b = input.nextDouble();
                    output = a - b;
                    System.out.println("Answer = " + output);
                }
                case '3' -> {
                    System.out.print("Enter the first number:");
                    a = input.nextDouble();
                    System.out.print("Enter the second number:");
                    b = input.nextDouble();
                    output = a * b;
                    System.out.println("Answer = " + output);
                }
                case '4' -> {
                    System.out.print("Enter the first number:");
                    a = input.nextDouble();
                    System.out.print("Enter the second number:");
                    b = input.nextDouble();
                    output = a / b;
                    System.out.println("Answer = " + output);
                }
                case '5' -> {
                    System.out.println("Goodbye");
                    bool = false;
                }
                default -> System.out.println("Wrong input, please try again");
            }
        }while(bool);
    }
}
