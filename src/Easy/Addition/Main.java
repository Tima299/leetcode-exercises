package Easy.Addition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter 'a' and 'b' ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        int result = solution.add(a, b);
        System.out.println("Result = "+result);
    }
}