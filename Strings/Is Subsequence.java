class Solution {
    public boolean isSubsequence(String s, String t) {
       int left=0;
       int right=0;
        if(left==s.length()){
            return true;
        }
       while(right<t.length()){
        char ch=s.charAt(left);
        char th=t.charAt(right); 
        if(ch==th){
            left++;
        }
        if(left==s.length()){
            return true;
        }
        right++;
       }
       return false;

    }
}
