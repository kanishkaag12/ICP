class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Pair> st = new  ArrayDeque<>();
        for(char ch: s.toCharArray()) {
            if(st.isEmpty() || st.peekLast().ch != ch) {
                st.addLast(new Pair(ch, 1));
            }else {
                st.peekLast().count++;
                if(st.peekLast().count == k) {
                    st.removeLast();
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for(Pair p: st) {
            for(int i=0; i<p.count; i++) {
                res.append(p.ch);
            }
        }
        return res.toString();
    }
    class Pair {
        char ch;
        int count;
        Pair(char ch, int c) {
            this.ch = ch;
            this.count = c;
        }
    }
}