class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int maximum=0;
      int count=0;
      for(int i:nums){
        if(i==0){
            count=0;
        }
        else{
            count++;
        }
        maximum=(maximum<count)?count:maximum;
      }  
      return maximum;
    }
}
