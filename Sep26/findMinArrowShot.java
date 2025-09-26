class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int c = 1;
        int[] prev = arr[0];
        for(int i=1; i<arr.length; i++) {
            int cs = arr[i][0];
            int ce = arr[i][1];

            int ps = prev[0];
            int pe = prev[1];

            if(pe < cs) {  //no-overlap
                c++;
                prev = arr[i];
            }
            else {    //overlapping
                prev[0] = Math.max(ps, cs);
                prev[1] = Math.min(pe, ce);
            }
        }

        return c;
    }
}