package Easy.Subtract_1281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int a = sc.nextInt();
        int result = solution.subtractProductAndSum(a);
        System.out.println("Result = " + result);
    }
}
