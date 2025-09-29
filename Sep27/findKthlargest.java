class Solution {
    /* public void reverse(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n/2; i++) {
            int t = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = t;
        }
    } */
    public int findKthLargest(int[] nums, int k) {
       /*  Arrays.sort(nums);  //nlogn
        reverse(nums);
        return nums[k-1]; */
        
        //n logk
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}
