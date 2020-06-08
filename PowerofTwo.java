class Solution {
    public boolean isPowerOfTwo(int n) {
//         if(n==0)
//             return false;
       
        
//         return floor(log2(n))==ceil(log2(n))?true:false;
        return n>0 &&(n&(n-1))==0;
        
    }
}