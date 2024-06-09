import java.util.Scanner;
public class Exercise {
    // function that have return value
    public int calculateRectangleArea() {
        Scanner myobj = new Scanner(System.in); // create Scanner object
        int area = 0;
        int width;
        int height;
        System.out.println("Enter width:" );
        width = myobj.nextInt(); // read int from user input
        System.out.println("Enter height: ");
        height = myobj.nextInt();
        area = width * height;
        return area;

    }


    // function that display output
    public static void main(String [] args) {
        Exercise exercise = new Exercise(); // create an instance of the Exercise class
        int area = exercise.calculateRectangleArea();
        System.out.println(area);
    }

}