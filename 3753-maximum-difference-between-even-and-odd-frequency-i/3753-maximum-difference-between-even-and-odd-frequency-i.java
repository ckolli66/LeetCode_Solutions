class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(int num:freq.values())
        {
            if(num%2==0)
            {
                minEven=Math.min(minEven,num);
            }else{
                maxOdd=Math.max(maxOdd,num);
            }
        }
        return maxOdd-minEven; 
    }
}