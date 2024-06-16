import java.util.ArrayList;
import java.util.Arrays;
public class MyList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(7);
        nums.add(1);
        System.out.println("nums");
        System.out.println(nums);
        int[] arr = {9,8,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}