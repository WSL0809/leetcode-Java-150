package test;

import main.leetcode.removeDuplicates;
import org.junit.Test;

public class testRemoveDuplicates {
    @Test
    public void test() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }
}
