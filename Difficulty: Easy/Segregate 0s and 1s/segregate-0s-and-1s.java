class Solution {
    void segregate0and1(int[] arr) {
        // code here
        //Arrays.sort(arr);
        long countOfZeros = Arrays.stream(arr).filter(num -> num == 0).count();
        for(int i=0;i<arr.length;i++){
            if( i < countOfZeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
}
