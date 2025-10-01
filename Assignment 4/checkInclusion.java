class Solution {
    public boolean check(String w, String s) {
        char[] a = w.toCharArray();
        char[] b = s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(), m=s2.length();
        for(int i=0; i<=m-n; i++) {
            String w = s2.substring(i, i+n);
            if(check(w, s1)) return true;
        }
        return false;
    }
}