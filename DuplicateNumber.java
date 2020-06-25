class Solution {
    public int findDuplicate(int[] nums) {
       int slow=nums[0];
        int fast=nums[0];
        
        slow=nums[slow];
        fast=nums[nums[fast]];
        
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]]; //2 steps
        } //slow is at beginning of cycle (slow and fast meet form a cycle not the starting of cycle)
        
        int a_ptr=nums[0];
        int b_ptr=slow;
        
        while(a_ptr!=b_ptr)
        {
            a_ptr=nums[a_ptr];
            b_ptr=nums[b_ptr]; //loop to check for match and return it
        
    }
        return a_ptr;
}
}