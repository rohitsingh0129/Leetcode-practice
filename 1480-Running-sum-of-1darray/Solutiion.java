class Solution {
    public int[] runningSum(int[] nums) {
        int[] number=new int[nums.length];
     number[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           number[i]=number[i-1]+nums[i];
        }
        return number;
    }
}