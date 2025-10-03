class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int c=0, s=0, e=n-1;
        while(s<=e) {
            int sum=people[s]+people[e];
            if(sum>limit) {
                e--;
            }else {
                s++;
                e--;
            }
            c++;
        }
        return c;
    }
}