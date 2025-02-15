package Easy.AddDigits;

public class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update num to the new sum and repeat
        }
        return num;
    }
}
