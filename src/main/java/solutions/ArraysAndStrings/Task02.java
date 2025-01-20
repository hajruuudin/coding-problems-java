package solutions.ArraysAndStrings;

import java.util.HashSet;

/**
 *  Task: Check Zero Sum<br/><br/>
 *  Description:  Given an array of integers, check if there exists a sub array,
 *  regardless of the position of the elements, that sums up to 0.
 *  If there is a subarray, return true and print out the first possible solution found.
 *  of the sub arrays and return true. Otherwise, print “No solutions were found” and return false.<br/><br/>
 *  Input: int[] numbers<br/><br/>
 *  Example Input: [1,2,-5,6,4,-3,8]<br/><br/>
 *  Bonus task: Find all the possible combinations and print them out as well as returning true,
 */
public class Task02 {
    private static boolean Solution(int[] numbers) {
        if(numbers.length == 0 || numbers.length == 1){
            System.out.println("No solutions were found!");
            return false;
        }

        // HashSet to store cumulative sums
        HashSet<Integer> sumSet = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            // If sum is zero or sum is already in the set, we found a subarray
            if (sum == 0 || sumSet.contains(sum)) {
                System.out.println("Subarray with sum 0 found.");
                return true;
            }

            // Add the cumulative sum to the set
            sumSet.add(sum);
        }

        // No subarray with sum 0 found
        System.out.println("No solutions were found.");
        return false;
    }

    private static boolean SolutionBonus(int[] nums) {
        return false;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime() / 1000000;
        /* Test the solution here */
        Solution(new int[]{1,2,5,-4,-3,2,1});
        /* Test the solution here */
        long endTime = System.nanoTime() / 1000000;

        System.out.println("Total Runtime: ~" + (endTime - startTime) + "ms");
    }
}
