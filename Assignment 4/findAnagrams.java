class Solution {
    public boolean check(String w, String p) {
        char[] a = w.toCharArray();
        char[] b = p.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length(), m = p.length();
        for(int i = 0; i <= n - m; i++) {
            String w = s.substring(i, i + m);
            if(check(w, p)) {
                list.add(i);
            }
        }
        return list;
    }
}
