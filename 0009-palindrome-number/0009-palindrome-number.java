class Solution {
    public Boolean isPalindrome(int x) {
        int t=x;
        int r=0;
        while(t>0){
            r=r*10+(t%10);
            t=t/10;
        }
        
    return x==r;
    
        
    
    }
}