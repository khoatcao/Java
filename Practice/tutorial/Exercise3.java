public class Excercis3 {

    static int addtwonumber(int x, int y) {
        return x + y;
    }

    // overload the function here
    static int addtwonumber(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        int result1 = addtwonumber(5,6);
        int result2 = addtwonumber(5,6,7);
        System.out.println(result1);
        System.out.println(result2);
    }
}