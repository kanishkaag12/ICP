class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int len = num.length();
        for(char ch: num.toCharArray()) {
            while(!st.isEmpty() && k>0 && st.peek()-'0' > ch-'0') {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(k>0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char ch: st) sb.append(ch);

        while(sb.length()>0 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }

        return sb.length()==0? "0" : sb.toString();
    }
}