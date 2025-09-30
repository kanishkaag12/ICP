class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int top=0, bottom=m-1, left=0, right=n-1;
        while(top<=bottom && left<=right) {
            for(int i=top; i<=right; i++) {
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int i=right; i>=left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}