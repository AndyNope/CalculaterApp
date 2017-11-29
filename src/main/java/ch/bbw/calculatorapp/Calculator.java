/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.calculatorapp;

/**
 *
 * @author Andy Nope
 */
public class Calculator {

    public int addition(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public boolean getQuit(String input) {
        if (input.contains("quit")) {
            return false;
        }
        return true;
    }

    public void printSumOf(int sum1, int sum2) {
        System.out.println("Sum of " + sum1 + " and " + sum2 + " equals " + addition(sum1, sum2));
    }

    public String ifNoNumber(String input) {
        if(input.contains("quit")){
            System.exit(0);
        }
        if (!input.matches("^[0-9]*$")) {
            System.err.println("Bitte nur Zahlen! Es wird als 0 standardisiert.");
            return "0";
        } else {
            return input;
        }

    }
}
