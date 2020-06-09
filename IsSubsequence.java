class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length()==0)
           return true;
        
        int sp=0;//ptr(index)
        int tp=0;
        
        while(tp<t.length()){
            if(t.charAt(tp)==s.charAt(sp)){
                sp++;
                
                if(sp==s.length())//found the whole string
                    return true;
            }
            tp++;
        }
        return false;
            
        
        
        
    }
}