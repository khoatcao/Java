package com.example;
import java.util.Scanner;
enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}

interface ScientificOperations {
    void input();

    double performOperations(Operation operation, double num1, double num2);
}


public class Calculator implements ScientificOperations{
    // define a hello world method static
    public static void helloNewYear( String fname, int age) { 
        
        System.out.println(fname + "Ls" + age); 
    }
    public void input() {
    }


    public double performOperations(Operation operation, double num1, double num2) {
        double result = 0;
        switch (operation) {
            case ADD:
                result = num1 + num2;
                break;

            case SUBTRACT:
                result = num1 - num2;
                if (result < 0) {
                    System.out.println(result + "is negative");
                } else if (result == 0){
                    System.out.println(result + "= 0");
                } else { System.out.println(result + "is positive" );}

            case MULTIPLY:
                result = num1 * num2;
                if (result < 0 ) {
                    System.out.println(result + "less than 0");
                }
                else {
                    System.out.println(result + "greater than 0");
                }
            case DIVIDE:
                result = num1 / num2;
                System.out.println("result" + result);
        }

        return result;
    }
}
