import java.util.Scanner;
public class Exercise2 {

    public int sumofEvenNumbers(int start , int end) {
        int result = 0;
        while (start <= end) {
            if (start % 2 == 0) {
                result += start;
            }
            start ++;
        }
        return result;

    }


    public static void main (String [] args) {
            int start;
            int end;
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter start:");
            start = myobj.nextInt();
            System.out.println("nter end: ");
            end = myobj.nextInt();
            Exercise2 exercise2 = new Exercise2();
            int result = exercise2.sumofEvenNumbers(start, end);
            System.out.println(result);

    }
}


/*
* Coding Exercise - Loops
Write a Java program that calculates the sum of even numbers within a given range.

The function should ask the user to enter the starting number then the ending number and return the sum of the even numbers in that range.
* */