class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int nod=0,digit=0,temp=n,x=n,arm=0;
        while(temp>0){
            digit=temp%10;
            temp/=10;
            nod=nod+1;
        }
        while(x>0){
            digit=x%10;
            arm=arm+(int)Math.pow(digit,nod);
            x/=10;
        }
        if(arm==n){
            return true;
        }
        else{
            return false;
        }
    }
}