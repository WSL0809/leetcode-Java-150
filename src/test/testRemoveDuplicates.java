package test;

import main.leetcode.removeDuplicates;
import org.junit.Test;

public class testRemoveDuplicates {
    @Test
    public void test() {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates.removeDuplicates1(nums));
    }
}
