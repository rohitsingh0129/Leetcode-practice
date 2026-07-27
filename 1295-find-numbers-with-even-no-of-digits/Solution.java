class Solution {
    boolean check(int i){
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    } 
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(check(i)){
              count++; 
            }
        }
        return count;
    }
}