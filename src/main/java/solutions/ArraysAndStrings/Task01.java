package solutions.ArraysAndStrings;

import java.util.HashSet;

/**
 * Task: Find pair Sum<br/><br/>
 *
 * Description: Given an unsorted integer array, find a pair with the given sum in it.
 * The target number is given as "target". The function should return true if a pair
 * has been found, regardless of where it has been found.<br/><br/>
 *
 * Input: int[] nums - the array, int target - target sum<br/><br/>
 * Example Input: [1,2,5,4,7,8], 7
 */
public class Task01 {
    public static boolean Solution(int[] nums, int target) {
        // Create a HashSet to store elements
        HashSet<Integer> seen = new HashSet<>();

        // Iterate over the array
        for (int num : nums) {
            // Calculate the required complement to reach the target
            int complement = target - num;

            // Check if the complement is already in the set
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            // Add the current number to the set
            seen.add(num);
        }

        // If no pair is found
        System.out.println("No pair with the given sum found.");
        return false;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime() / 1000000;
        /* Test the solution here */
        Solution(new int[]{1,2,3,5,5}, 3);
        /* Test the solution here */
        long endTime = System.nanoTime() / 1000000;

        System.out.println("Total Runtime: ~" + (endTime - startTime) + "ms");
    }
}
