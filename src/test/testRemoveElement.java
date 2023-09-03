package test;

import org.junit.Test;

import static main.leetcode.removeElement.removeElement;

public class testRemoveElement {
    @Test
    public void removeElementTest(){
        int[] arr = {1, 2, 2, 3, 4, 5};

        System.out.println(removeElement(arr, 2));
    }
}
