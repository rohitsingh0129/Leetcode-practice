class Solution {
    public int countDigits(int num) {
        int count=0;
        if(num<10)return 1;
        String numbers=Integer.toString(num);
        for(int i=0;i<numbers.length();i++){
            int digit=Character.getNumericValue(numbers.charAt(i));
            if(num%digit==0){
                count++;
            }
        }
        return count;
    }
}