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

//Friends Solution -> Epammer
/*public class Solution {
    public int alternateDigitSum(int n) {
        int l = String.valueOf(n).length();
        return r(l % 2 == 0 ? false : true, n, 0);
    }

    public int r(boolean s, int n, int S) {
        if (n <= 0) {
            return S;
        }
        int t = s ? n % 10 : -1 * n % 10;
        return r(!s, n /= 10, S + t);
    }

}*/
