class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] arr={-1,-1};
       arr[0]=search(nums,target,true);
       arr[1]=search(nums,target,false);
       return arr;
    }
    public int search(int[] nums,int target,boolean findvalue){
        int ans=-1;
        int low=0;
       int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                ans=mid;
                if(findvalue){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            
        
        }
        return ans;
    }
}