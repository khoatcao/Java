public class Array {
    static int averageage(int[] age) {
        int sum = 0;
        for (int i = 0; i < age.length; i++){
            sum += age[i];
        }
        int avg = sum/age.length;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] age = {1,2,3};
        int avg = averageage(age);
        System.out.println(avg);
    }
}