class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left=0,right=0,m=0;
        Set<Character> set =new HashSet<>();
       while(left<s.length() && right<s.length())
       {
           if(!set.contains(s.charAt(right)))
           {
               set.add(s.charAt(right));
               right++;
               m=Math.max(m,(right-left));
           }
           else
           {
               
               set.remove(s.charAt(left));
               left++;
           }
       }
    return m;
    }
}