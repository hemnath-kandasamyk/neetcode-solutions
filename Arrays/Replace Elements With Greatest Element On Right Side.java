class Solution {
    public int[] replaceElements(int[] arr) {
       int right=arr[arr.length-1];
       arr[arr.length-1]=-1;
       for(int i=arr.length-2;i>=0;i--){
        int temp=right;
        if(arr[i]>right){
            right=arr[i];
        }
        arr[i]=temp;
       } 
       return arr;
    }
}
