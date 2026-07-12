class Solution {
    public boolean judgeCircle(String moves) {
        int ucount=0;
        int rcount=0;
        for(int i=0;i<moves.length();i++){ 
        char currentchar=moves.charAt(i);
        if(currentchar=='U'){
            ucount++;
        }
          if(currentchar=='D'){
            ucount--;
        }
          if(currentchar=='R'){
            rcount++;
        }
          if(currentchar=='L'){
            rcount--;
        }
        }
        if(ucount==0&&rcount==0){
            return true;
        }
        return false;
    }
}