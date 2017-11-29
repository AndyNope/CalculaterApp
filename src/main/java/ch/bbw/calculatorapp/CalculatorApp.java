/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.calculatorapp;

import java.util.Scanner;

/**
 *
 * @author Andy Nope
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);

        System.out.println("Dies addiert 2 Zahlen.");
        System.out.println("Beenden Sie mit \"quit\"");
        boolean run = true;
        String input;
        while (run) {
            System.out.println("Geben Sie die 1. Zahl ein: ");
            int a = Integer.parseInt(calc.ifNoNumber(input = scan.nextLine()));
            run = calc.getQuit(input);
            System.out.println("Geben Sie die 2. Zahl ein: ");
            int b = Integer.parseInt(calc.ifNoNumber(input = scan.nextLine()));
            run = calc.getQuit(input);
            
            calc.printSumOf(a, b);
        }
    }
}
