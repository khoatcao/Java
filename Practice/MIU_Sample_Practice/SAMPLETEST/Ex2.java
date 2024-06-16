import java.util.Scanner;
public class Ex2 {
    static int countsum(int[] arr) {
        int x = 0; // sum of odd numers
        int y = 0; // sum of even numbers
        int result = 0; // x - y;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                x += arr[i];
            }
            else {
                y += arr[i];
            }
        }
        result = x - y;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countsum(arr);
        System.out.println(result);
    }
}