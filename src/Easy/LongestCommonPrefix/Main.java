package Easy.LongestCommonPrefix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Solution sl = new Solution();

        System.out.print("Enter number of words: ");
        int n = s.nextInt();  // Read the number of words
        s.nextLine();  // Consume the newline

        String[] array = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextLine();  // Read each word
        }

        // Pass the correct string array to the method
        System.out.println("Longest Common Prefix: " + sl.longestCommonPrefix(array));

        s.close();
    }
}