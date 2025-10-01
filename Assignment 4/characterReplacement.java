class Solution {
    public boolean canConvert(String s, int start, int end, int k) {
        int[] count = new int[26];
        int maxFreq = 0;

        for (int i = start; i <= end; i++) {
            count[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(i) - 'A']);
        }
        return (end - start + 1) - maxFreq <= k;
    }
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (canConvert(s, i, j, k)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    
}
