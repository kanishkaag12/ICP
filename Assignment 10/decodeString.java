class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> stringSt = new Stack<>();

        int k=0;

        for(char ch: s.toCharArray()) {
            if(Character.isDigit(ch)) {
                k = (k*10) + (ch - '0');
                continue;
            }

            if(ch=='[') {
                numSt.push(k);
                k=0;
                stringSt.push(String.valueOf(ch));
                continue;
            }

            if(ch!=']') {
                stringSt.push(String.valueOf(ch));
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while(!stringSt.peek().equals("[")) {
                temp.insert(0, stringSt.pop());
            }

            stringSt.pop();

            StringBuilder res = new StringBuilder();
            int c = numSt.pop();
            for(int i=0; i<c; i++) {
                res.append(temp);
            }

            stringSt.push(res.toString());
        }

        StringBuilder sb = new StringBuilder();
        while(!stringSt.isEmpty()) {
            sb.insert(0, stringSt.pop());
        }

        return sb.toString();
    }
}