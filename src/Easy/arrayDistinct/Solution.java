package Easy.arrayDistinct;

import java.lang.reflect.Array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1]){
               while((nums.length - 3)> i && nums[i] == nums[i + 1]){
                   count++;
               }
            }
            else{
                return 0;
            }
        }
        return count;
    }
}
