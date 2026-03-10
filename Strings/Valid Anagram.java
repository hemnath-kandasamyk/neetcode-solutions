class Solution {
    public boolean isAnagram(String s, String t) {
     int[] freq=new int[128];
     for(char i:s.toCharArray()){
        freq[i]++;
     }
     for(char i:t.toCharArray()){
        freq[i]--;
     }
     for(int i:freq){
        if(i!=0){
            return false;
        }
     }
     return true;
    }
}
