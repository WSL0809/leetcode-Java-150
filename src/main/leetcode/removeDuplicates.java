package main.leetcode;

import main.utils.Utils;

import java.util.Arrays;

public class removeDuplicates {
    //最笨的办法，时间复杂度很高
    public static int removeDuplicates1(int[] nums) {
        int count = 1;
        int biggest = nums[nums.length - 1];
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
//                Utils.del(nums, i);
                nums[i] = biggest;
                System.out.println(Arrays.toString(nums));
            }
            i++;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int j = 0; nums[j] < biggest; j++) {
            count++;
        }
        return count;
    }

    // 双指针 快慢指针
    public static int removeDuplicates2(int[] nums) {
        int i = 1, j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
