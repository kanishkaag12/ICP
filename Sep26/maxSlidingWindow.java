import java.util.Arrays;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];
        int s = 0, e = 0, c = 0;
        while(e<n) {
            if((e-s+1) < k) {
                e++;
            }else {
                int max = Arrays.stream(nums, s, e+1).max().orElseThrow();
                arr[c++] = max;
                s++; e++;
            }
        }
        return arr;
    }
}