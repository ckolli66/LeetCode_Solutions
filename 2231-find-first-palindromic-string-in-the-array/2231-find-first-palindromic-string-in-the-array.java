class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String s)
    {
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(i<j){
            char ch=s.charAt(i);
            if(ch!=s.charAt(j))
            {
                return false;
            }
            j--;
            }
        }
        return true;
    }
}