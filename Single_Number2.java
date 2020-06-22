class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int sum, mask;
       
        for(int i = 0; i < 32; i++){ //32 bit
            mask = (1 << i);
            sum = 0;
            for(int n : nums){
                if((n & mask) != 0) sum++;
            }
            if(sum % 3 != 0) res |= mask; //current bit is already set
        }
       
        return res;
    }
        
    
}