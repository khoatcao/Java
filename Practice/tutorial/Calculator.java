///*
//Create a simple command-line calculator that takes two numbers as inputs and performs arithmetic operations on them. The calculator should support the following operations:
//
//Addition (+)
//
//Subtraction (-)
//
//Multiplication (*)
//
//Division (/)
//
//Modulo (%)
//
//Exponentiation (^)
//
//The calculator should also handle any type casting and display the result as accurately as possible.
//
//Instructions:
//
//Create a Java project in Eclipse or any IDE of your choice.
//
//Create a class called "Calculator" that has a main method.
//
//Within the main method, prompt the user to enter two numbers and the operation they want to perform.
//
//Use the appropriate Java operators and data types to perform the arithmetic operation.
//
//Display the result to the user.
//
//* */
//import java.util.Scanner;
//
//
//interface Manipulation {
//    double Addition(double num1, double num2);
//    double Subtraction(double num1, double num2);
////    double Multiplication(double num1, double num2);
////    double Division(double num1, double num2);
////    double Modulo(double num1, double num2);
////    double Exponentiation(double num1, double num2);
//}
//
//class Calculator implements Manipulation {
//    public double Addition(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public double Subtraction(double num1, double num2) {
//        return num1 - num2;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        double num1;
//        double num2;
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        num1 = myobj.nextDouble();
//        System.out.println("Enter num2: ");
//        num2 = myobj.nextDouble();
//
//        Calculator calculator = new Calculator();
//        double sum = calculator.Addition(num1, num2);
//        System.out.println(sum);
//
//    }
//}