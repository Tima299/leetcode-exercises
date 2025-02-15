package Easy.Alternate_2544;

public class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0, length = 0, temp = n;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        int sign = (length % 2 == 0) ? -1 : 1;
        while (n > 0) {
            int digit = n % 10;
            sum += sign * digit;
            sign *= -1;
            n /= 10;
        }
        return sum;
    }
}
