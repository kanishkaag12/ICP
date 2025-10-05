public class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans = Integer.MIN_VALUE;
        int s=0;
        for(int i:nums) {
            s+=i;
            ans=Math.max(ans, s);
            if(s<0) {
                s=0;
            }
        }
        return ans;
    }
} 
