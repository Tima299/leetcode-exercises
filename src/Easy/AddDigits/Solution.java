package Easy.AddDigits;

public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int tinySum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }
        while (sum > 0) {
            int sumDigit = sum % 10;
            tinySum += sumDigit;
            sum /= 10;
        }
        return tinySum;
    }
}
