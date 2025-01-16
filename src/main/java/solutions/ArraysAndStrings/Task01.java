package solutions.ArraysAndStrings;

/**
 * Task: Largest divisor
 *
 * Description: You are given a number
 */
public class Task01 {
    private static void Solution(){
        for (int i = 0; i < 100; i++){
            System.out.println("hajruudin");
        }
    };

    public static void main(String[] args) {
        long startTime = System.nanoTime() / 1000000;
        Solution();
        long endTime = System.nanoTime() / 1000000;

        System.out.println("Total Runtime: ~" + (endTime - startTime) + "ms");
    }
}
