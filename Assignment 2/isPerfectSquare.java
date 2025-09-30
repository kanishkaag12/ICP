class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1, e=num;
        while(s<=e) {
            int m = s+(e-s)/2;
            if((long)m*m == num) return true;
            if((long)m*m > num) e=m-1;
            else s=m+1;
        }
        return false;
    }
}