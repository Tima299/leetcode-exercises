package Easy.Palindrome_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter 'a'");
        int a = scanner.nextInt();
        boolean result = solution.isPalindrome(a);
        System.out.println("Result = "+result);
    }
}
