package main.leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
