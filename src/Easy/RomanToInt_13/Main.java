package Easy.RomanToInt_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter a string");
        String a = scanner.nextLine();
        int result = solution.romanToInt(a);
        System.out.println("Result = "+result);
    }
}
