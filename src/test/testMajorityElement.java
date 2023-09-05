package test;


import org.junit.Test;

import static main.leetcode.MajorityElement.majorityElement;

public class testMajorityElement {
    @Test
    public void test(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }


}
