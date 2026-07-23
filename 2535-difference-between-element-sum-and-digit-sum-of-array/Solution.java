class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
            int j=nums[i];
            while(j>0){
                digitsum+=j%10;
                j /= 10;
            }
        }
     return elementsum-digitsum;
    }
}