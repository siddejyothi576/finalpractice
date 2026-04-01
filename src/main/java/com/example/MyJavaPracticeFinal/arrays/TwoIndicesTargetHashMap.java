package com.example.MyJavaPracticeFinal.arrays;

import java.util.HashMap;
import java.util.Map;



public class TwoIndicesTargetHashMap {

    /**
     * Finds the indices of two numbers in an array that add up to a specific target.
     * Assumes exactly one solution exists and an element cannot be used twice.
     *
     * @param nums   The array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers.
     *
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Complement found, return its index and the current index
                return new int[]{map.get(complement), i};
            }

            // Complement not found, put the current number and its index into the map
            map.put(nums[i], i);
        }

        // According to the problem constraints, a solution is guaranteed to exist,
        // so this line should ideally not be reached.
        throw new IllegalArgumentException("No two sum solution");
    }
}

