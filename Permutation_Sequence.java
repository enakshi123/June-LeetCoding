class Solution {
    public String getPermutation(int n, int k) {
        List<Integer>nums=new ArrayList<Integer>();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            nums.add(i);
            fact=fact*i;
        }
        k--; //index sequence of  number
        fact/=n; //simplified
         StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=1;i--) //only 1 element in case so append it to the other elements in array
        {
            int curr=k/fact;
            sb.append(String.valueOf(nums.get(curr)));
            nums.remove(curr);
            k%=fact;
            fact/=i;
        }
        sb.append(String.valueOf(nums.get(0))); //one element length
        return sb.toString();
        
    }
}