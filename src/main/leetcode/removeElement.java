package main.leetcode;

import main.utils.Utils;

import java.util.Arrays;

public class removeElement {
    // 第 27 题

    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                Utils.swap(nums, i, j);
                --i;
                --j;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j + 1;
    }
}
