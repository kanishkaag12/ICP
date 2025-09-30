public class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        /* for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == target) return true;
            }
        }
        return false; */

        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++) {
            int min = 0, max = n-1;
            while(min<=max) {
                if(t>arr[i][max]) break;
                int mid = min+(max-min)/2;
                if(arr[i][mid]==t) return true;
                if(arr[i][mid]<t) min=mid+1;
                else max=mid-1;
            }
        }
        return false;
    }
} 
