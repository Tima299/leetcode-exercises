package Easy.Alternate_2544;


public class Solution {
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

}
