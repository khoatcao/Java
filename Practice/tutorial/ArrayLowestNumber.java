public class ArrayLowestNumber {

    static int lowestnumber(int[] nums) {
        int lowest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < lowest) {
                lowest = nums[0];
            }
        }
        return lowest;
    }

    public static void main(String[] args) {

        System.out.println("Find the lowest number in array");
        int[] nums = {9,2,3};
        int lowest = lowestnumber(nums);
        System.out.println(lowest);
    }
}