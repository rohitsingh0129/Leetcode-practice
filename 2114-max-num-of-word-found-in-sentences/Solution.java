class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxword=0;
        for(int i=0;i<sentences.length;i++){
            int space=0;
            String currentsentence=sentences[i];
            for(int j=0;j<currentsentence.length();j++){
                if(currentsentence.charAt(j)==' '){
                    space++;
                }
            }
            maxword=Math.max(maxword,space);
        }
        return maxword+1;
    }
}
