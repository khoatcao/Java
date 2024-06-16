import java.util.Scanner;

public class Function {
    // create a function that does not return a value
    static void printmessage() {
        System.out.println("Hello World");
    }
    // create a function that return a value with parameter
    static int returnint(int x) {
        return x;
    }

    // create a static function to calculate sum of two integers

    static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printmessage();
        System.out.println("Input something");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(returnint(x));
        System.out.println(sum(x,y));
    }
}