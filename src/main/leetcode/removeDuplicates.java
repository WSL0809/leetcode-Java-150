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
}
