import java.util.Arrays;

public class Main {

    // 第 27 题
    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                swap(nums, i, j);
                --i;
                --j;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j + 1;
    }

    // 第 26 题
    public static int removeDuplicates(int[] nums) {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}