class Solution {
    public void clear(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0') return;

        grid[i][j] = '0';
        // int[] dr = {-1, 0, 1, 0};
        // int[] dc = {0, 1, 0, -1}; 
        int[][] a = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for(int k=0; k<4; k++) {
            // int r = i+dr[k];
            // int c = j+dc[k];
            int r = i+a[k][0];
            int c = j+a[k][1];
            clear(grid, r, c);
        }
    }
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0; i<grid.length; i++)  {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    c++;
                    clear(grid, i, j);
                }
            }
        }

        return c;
    }
}