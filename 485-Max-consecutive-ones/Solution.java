class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max=0;
         int tempmax=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){                        
            tempmax++;
        }
        //  else { 
        //         // Fix 1: Changed to 'else' to avoid the redundant second 'if' check
        //         // Fix 2: Replaced the manual 'if' comparison with JVM-optimized Math.max()
        //         max = Math.max(max, tempmax);
        //         tempmax = 0;
        //     }
        if(nums[i]==0){
            if(max<tempmax){
                max=tempmax;
            }
            tempmax=0;
        }
       }
       return Math.max(max,tempmax); 
    }
}
