/*
Write a function that accepts a character array, a zero-based start position and a length.
It should return a character array containing containing lengthcharacters starting with
the startcharacter of the input array. The function should do error checking on the start position and
the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 */
import java.util.Scanner;
public class Ex3 {

    static char[] newsubarray(char[] arr, int start, int len) {
        // hanlde invalid case
        if (start < 0 || len < 0 || len > arr.length || start > len || arr == null || start + len >  arr.length ) {
            return null;
        }
        // handle valid case
        // create new array
        char[] subarray = new char[len];
        for (int i =0; i < len; i++) {
            subarray[i] = arr[start + i];
        }
        return subarray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the start position of array");
        int start = sc.nextInt();
        System.out.println("Enter the subarray: ");
        int len = sc.nextInt();
        char[] result = newsubarray(arr, start, len);
        if (result != null) {
            System.out.println(result);
        }
        else {
            System.out.println("null");
        }


    }
}