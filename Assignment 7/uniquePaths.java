class Solution {
    public int helper(boolean[][] vis, int m, int n, int r, int c, int count, int[][] dp) {
        if(r<0 || c<0 || vis[r][c]==true) return 0;
        if(r==0 && c==0) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        vis[r][c] = true;
        int u =  helper(vis, m, n, r-1, c, count+1, dp);
        int l = helper(vis, m, n, r, c-1, count+1, dp);
        vis[r][c] = false;
        return dp[r][c] = u+l;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] d: dp) Arrays.fill(d, -1);
        boolean[][] vis = new boolean[m][n];
        return helper(vis, m, n, m-1, n-1, 0, dp);
    }
}