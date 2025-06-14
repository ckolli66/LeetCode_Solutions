class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        char replaceMaxNumber=' ';
        char replaceMinNumber=' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='9')
            {
                replaceMaxNumber=s.charAt(i);
                break;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                replaceMinNumber=s.charAt(i);
                break;
            }
        }
        String afterMaxNumber = s;
        String afterMinNumber = s;
        StringBuilder modifiedMax = new StringBuilder(afterMaxNumber);
        StringBuilder modifiedMin = new StringBuilder(afterMinNumber);

        for (int i = 0; i < modifiedMax.length(); i++) {
            if (modifiedMax.charAt(i) == replaceMaxNumber) {
            modifiedMax.setCharAt(i, '9');
            }
            if (modifiedMin.charAt(i) == replaceMinNumber) {
            modifiedMin.setCharAt(i, '0');
            }
        }

        afterMaxNumber = modifiedMax.toString(); 
        afterMinNumber = modifiedMin.toString(); 
        

        return Integer.parseInt(afterMaxNumber)-Integer.parseInt(afterMinNumber);
    }
}