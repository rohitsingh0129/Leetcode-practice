class Solution {
    public int countKeyChanges(String s) {
        int count=0;
      char a;
      char b;
      for(int i=0;i<s.length()-1;i++){
        a=Character.toLowerCase(s.charAt(i));
        b=Character.toLowerCase(s.charAt(i+1));
        if(a!=b){
            count++;
        }
      }
      return count;  
    }
}
