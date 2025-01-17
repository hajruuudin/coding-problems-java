package solutions.ArraysAndStrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task01Test {
    @Test
    void testValidPairs() {
        // Test with a standard array and target sum
        assertTrue(
                Task01.Solution(new int[]{1, 2, 3, 4, 5, 6}, 11),
                "Pair should be 5,6"
        );

        // Test with negative numbers
        assertTrue(
                Task01.Solution(new int[]{-3, -1, 0, 1, 2, 4}, 1),
                "Pair should be -1,2"
        );

        // Test with duplicate values
        assertTrue(
                Task01.Solution(new int[]{1, 2, 2, 3, 4, 5}, 7),
                "Pair should be 2,5"
        );

        // Test with large numbers
        assertTrue(
                Task01.Solution(new int[]{100000, 200000, 300000, 400000}, 500000),
                "Pair should be 100000,400000"
        );

        // Test with multiple valid pairs (ensure any valid pair works)
        assertTrue(
                Task01.Solution(new int[]{1, 9, 3, 7, 5}, 10),
                "Pair could be 1,9 or 3,7"
        );
    }

    @Test
    void testInvalidPairs() {
        // Test with an empty array
        assertFalse(
                Task01.Solution(new int[]{}, 11),
                "No pairs exist in an empty array"
        );

        // Test with a single element array
        assertFalse(
                Task01.Solution(new int[]{5}, 11),
                "No pairs exist with a single element"
        );

        // Test where no pairs match the target
        assertFalse(
                Task01.Solution(new int[]{1, 2, 3, 4}, 10),
                "No pairs match the target"
        );

        // Test with negative target
        assertFalse(
                Task01.Solution(new int[]{1, 2, 3, 4, 5}, -1),
                "No pairs sum to a negative target"
        );
    }

    @Test
    void testEdgeCases() {
        // Test with an array where all elements are the same
        assertFalse(
                Task01.Solution(new int[]{1, 1, 1, 1}, 3),
                "No pairs exist that sum to 3"
        );

        // Test with large inputs where the sum doesn't exist
        assertFalse(
                Task01.Solution(new int[]{100000, 200000, 300000}, 700000),
                "No pairs sum to 700000"
        );

        // Test with large negative numbers
        assertTrue(
                Task01.Solution(new int[]{-10, -20, -30, -40}, -50),
                "Pair should be -20,-30"
        );
    }
}
