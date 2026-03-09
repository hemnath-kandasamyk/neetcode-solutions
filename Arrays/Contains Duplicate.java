class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:nums){
            if(h1.contains(i)){
                return true;
            }
            h1.add(i);
        }
        return false;
    }
}
