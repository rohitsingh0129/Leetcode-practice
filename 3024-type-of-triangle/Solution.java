class Solution {
    public String triangleType(int[] nums) {
        int maxside=Math.max(nums[0],Math.max(nums[1],nums[2]));
        int sumofallside=nums[0]+nums[1]+nums[2];
    if(sumofallside-maxside<=maxside){
        return "none";
    }
      if(nums[0]==nums[1]&&nums[1]==nums[2]){
        return "equilateral";
      }  
      else if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]){
        return "scalene";
      }
      return "isosceles";
    }
}