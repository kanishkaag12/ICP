class Solution {
    /* public  boolean find(char[][] board, int i, int j, int idx, String s, int m, int n) {
        if(idx==s.length()) return true;
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!=s.charAt(idx)) return false;

        /*if(idx==s.length()) return true;
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]=='#') return false;
        char ch=board[i][j];
        board[i][j] = '#';
        int[][] a = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for(int k=0; k<4; k++) {
            int r = i+a[k][0];
            int c = j+a[k][1];
            if(r>=0 && r<m && c>=0 && c<n && s.charAt(idx)==board[r][c]) {
                if(find(board, r, c, idx+1, m, n, s)) return true;
            }
        }
        board[i][j] = ch; */
        /*char ch=board[i][j];
        board[i][j] = '#';
        boolean ans = false;
        ans|= find(board, i+1, j, idx+1, s, m, n);
        ans|= find(board, i-1, j, idx+1, s, m, n);
        ans|= find(board, i, j+1, idx+1, s, m, n);
        ans|= find(board, i, j-1, idx+1, s, m, n);
        board[i][j] = ch;
        return ans;
    } */
    public boolean find(char[][] board, int r, int c, String s) {
        if(s.length()==0) return true;
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!=s.charAt(0)) return false;
        char ch = board[r][c];
        board[r][c] = '#';
        boolean ans = false;
        ans |= find(board, r+1, c, s.substring(1));
        ans |= find(board, r-1, c, s.substring(1));
        ans |= find(board, r, c+1, s.substring(1));
        ans |= find(board, r, c-1, s.substring(1));
        board[r][c] = ch;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    // if(find(board, i, j, 1, word, m, n)) return true;
                    // if(find(board, i, j, 0, word, m, n)) return true;
                    if(find(board, i, j, word)) return true;
                }
                // print(board);
            }
        }
        return false;
    }
    /* void print(char b[][]) {
        for(char[] i: b) {
            System.out.println(i);
        }
        System.out.println();
    } */
}