class Solution {
    public int lower(int[] nums, int n, int t) {
        int s=0, e=n-1;
        int l=-1;
        while(s<=e) {
            int m = s + (e-s)/2;
            if(nums[m]==t) {
                l=m;
                e=m-1;
            }else if(nums[m] > t) {
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return l;
    }
    public int higher(int[] nums, int n, int t) {
        int s=0, e=n-1;
        int h=-1;
        while(s<=e) {
            int m = s + (e-s)/2;
            if(nums[m]==t) {
                h=m;
                s=m+1;
            }else if(nums[m] > t) {
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return h;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = lower(nums, n, target);
        int h = higher(nums, n, target);
        int[] arr = new int[2];
        arr[0] = l;
        arr[1] = h;
        return arr;
    }
}