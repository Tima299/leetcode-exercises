package Easy.RemoveDuplicatesSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 5, 5};
        int newLength = solution.removeDuplicates(nums);

        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }
}
