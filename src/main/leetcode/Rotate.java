package main.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Arrays.stream(nums).forEach(queue::add);
        while (k > 0) {
            queue.addFirst(queue.pollLast());
            k--;
        }
//        System.out.println(queue);
        for (int i = 0; i < nums.length; i++) {
            nums[i]= queue.pollFirst();
        }
//        System.out.println(Arrays.toString(nums));
    }
}
