class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tot=n*(n+1)/2;
        int x=0;
        int mis;
        for(int i=0;i<n;i++){
            x=x+nums[i];
        }
        return mis=tot-x;
    }
}