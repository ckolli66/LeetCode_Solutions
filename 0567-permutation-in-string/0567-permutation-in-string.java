class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> freqS1 = new HashMap<>();
        HashMap<Character,Integer> freqS2 = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            freqS1.put(s1.charAt(i),freqS1.getOrDefault(s1.charAt(i),0)+1);
        }
        int left=0,right=0;
        while(right<s2.length())
        {
            freqS2.put(s2.charAt(right),freqS2.getOrDefault(s2.charAt(right),0)+1);
            if(right - left + 1 > s1.length())
            {
               freqS2.put(s2.charAt(left),freqS2.get(s2.charAt(left))-1);
               if(freqS2.get(s2.charAt(left))==0)
               {
                freqS2.remove(s2.charAt(left));
               }
               left++;
            }
            if(freqS1.equals(freqS2))
            {
                return true;
            }
            right++;
        }
        return false;
    }
}