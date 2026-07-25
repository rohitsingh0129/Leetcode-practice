class Solution {
    public int maxProduct(int n) {
        int length=String.valueOf(n).length();
        int[] digit=new int[length];
        String s=Integer.toString(n);
        for(int i=0;i<length;i++){
            char temp;
            digit[i]=Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(digit);
        return digit[length-1]*digit[length-2];
    }
}
// optimized solution
/*class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        return max1 * max2;
    }
} */