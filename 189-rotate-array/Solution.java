class Solution {
    static void swap(int[]num,int start,int end){
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        
    }
    }
