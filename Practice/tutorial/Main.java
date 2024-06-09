import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0.0;
        System.out.println("Enter num1: ");
        num1 = myobj.nextDouble();
        System.out.println("Enter num2: ");
        num2 = myobj.nextDouble();
        System.out.println("Enter operation (+, -, *, /, %, ^):  ");
        char operation = myobj.next().charAt(0);

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
                result = num1%num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Wrong operation");
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}