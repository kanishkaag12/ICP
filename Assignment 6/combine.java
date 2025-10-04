class Solution {
    public void solve(int start, int n, int k, List<List<Integer>> list, List<Integer> temp) {
        if(k==0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        /* if(start > n) return;

        temp.add(start);
        solve(start+1, n, k-1, list, temp);
        temp.remove(temp.size()-1);
        solve(start+1, n, k, list, temp); */

        for(int i=start; i<=n; i++) {
            temp.add(i);
            solve(i+1, n, k-1, list, temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        solve(1, n, k, list, new ArrayList<>());
        return list;
    }
}