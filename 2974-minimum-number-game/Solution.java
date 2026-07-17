class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i+=2){
            arr[i]=nums[i+1];
           arr[i+1]=nums[i];
        }
        return arr;
    }
}