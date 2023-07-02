/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Vytas K
 */

package com.mycompany.simplecalulator;

//Imported libraries

import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleCalulator {
    
    public static void main(String[] args) {
        
        double a, b, answer = 0;
        int c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextDouble();
            
        System.out.println("Enter the second number: ");
        b = scanner.nextDouble();
            
        c = calculationIndex(scanner);
        
   
        while (true) {
            switch (c) {
                case 1:
                    answer = addition(a, b);
                    break;
                case 2:
                    answer = subtraction(a, b);
                    break;
                case 3:
                    answer = multiplication(a, b);
                    break;
                case 4:
                    answer = division(a, b);
                    break;
                default:
                    System.out.println("Calculation index is invalid. Please try again.");
                    c = calculationIndex(scanner);
                    continue;
            }
            break;
        }
        System.out.println("The answer is: " + decimalFormat(answer));
    }
    
    //Methods
    //Method for getting the calcualtion index
    
    public static int calculationIndex(Scanner scanner) {
        System.out.println("""
                               Enter calculation index
                               (Press 1 for addition (+)
                               Press 2 for subtraction (-)
                               Press 3 for multiplication (*)
                               Press 4 for division (/)): """);
        int c;
        c = scanner.nextInt();
        return c;
    }
    
    //Methods for calcualtions
    
    public static double addition (double a, double b) {
        double ans = a + b;
        return ans;
    }
    
    public static double subtraction (double a, double b) {
        double ans = a - b;
        return ans;
    }
    
    public static double multiplication (double a, double b) {
        double ans = a * b;
        return ans;
    }
    
    public static double division (double a, double b) {
        double ans = a / b;
        return ans;
    }
    
    //Method for formatting answer for decimal points
    
    public static String decimalFormat (double answer) {
        int digitsAfterDecimal = 2;
        DecimalFormat decimalFormat = new DecimalFormat("#." + "0".repeat(digitsAfterDecimal));
        String formattedAnswer = decimalFormat.format(answer);
        return formattedAnswer;
    }
}
