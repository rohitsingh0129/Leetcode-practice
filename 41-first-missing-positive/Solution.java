class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]!=n){ 
            return n;
            }
            n++;
        }
        return n;
    }
}

// THIS ONE SMALLEST APPROACH
// int target = 1;
// for (int i = 0; i < nums.length; i++) {
//     if (nums[i] == target) {
//         target++;
//     }
// }
// return target;
