public class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int n = arr.length;
        int c=1; int overlapping=arr[0][1];
        for(int i=1; i<n; i++) {
            if(arr[i][0] >= overlapping) {
                c++;
                overlapping=arr[i][1];
            }
        }

        return n-c;
    }
}
