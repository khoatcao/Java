package com.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            Calculator.helloNewYear("whoa", 20);
            double num1, num2;
            Scanner myObj = new Scanner(System.in);
            num1 = myObj.nextDouble();
            num2 = myObj.nextDouble();
            Calculator cal = new Calculator();
            cal.input();
            double resultAddition = cal.performOperations(Operation.ADD, num1, num2);
            System.out.println("Result Addition"  +  resultAddition);
        }
        catch(Error e) {
            System.out.println("Invalid Input");
        }

    }
}