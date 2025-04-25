package Easy.arrayDistinct;

import java.util.Arrays;
import java.util.Scanner;
import Easy.arrayDistinct.Solution;
public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);

        System.out.println("The number of unique elements is: " + result);
    }
}
