class Solution {
    public boolean check(String s) {
        int n = s.length();
        if(n==1) return true;
        char[] arr = s.toCharArray();
        Arrays.sort(arr); //n log n
        int p1=0, p2=1;
        while(p2<n) {
            if(arr[p1]==arr[p2]) return false;
            p1++; p2++;
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //Total TC: O(n^3 log n)
        if(n==0) return 0;
        if(n==1) return 1;
        int ans = 0;
        //n^2
        for(int i=0; i<n; i++) {
            String w = "";
            for(int j=i; j<n; j++) {
                w += s.charAt(j);
                if(check(w)) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}