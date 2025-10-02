class Solution {
    public boolean lemonadeChange(int[] arr) {
        int five=0, ten=0;
        int i=0;
        while(i<arr.length) {
            if(arr[i]==5) five++;
            else if(arr[i]==10) {
                if(five<=0) return false;
                ten++; five--;
            }
            else {
                if(five>=1 && ten>=1) {
                    ten-=1; five-=1;
                }else if(five>=3){
                    five-=3;
                }else return false;
            }
            i++;
        }
        return true;
    }
}