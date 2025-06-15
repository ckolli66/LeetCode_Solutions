class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        char xPicked=' ';
        char yPicked=' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='9')
            {
                xPicked=s.charAt(i);
                yPicked='9';
                break;
            }
        }
        char xPicked_Min=' ';
        char yPicked_Min=' ';
        if (s.charAt(0)!= '1') {
            xPicked_Min = s.charAt(0);
            yPicked_Min = '1';
        }else{
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!='0' && s.charAt(0)!=s.charAt(i))
            {
                xPicked_Min=s.charAt(i);
                yPicked_Min='0';
                break;
            }
        }
        }
        StringBuilder aNum=new StringBuilder(s);
        StringBuilder bNum=new StringBuilder(s);
        for(int i=0;i<bNum.length();i++)
        {
            if(aNum.charAt(i)==xPicked)
            {
                 aNum.setCharAt(i,yPicked);
            }
            if(bNum.charAt(i)==xPicked_Min)
            {
                 bNum.setCharAt(i,yPicked_Min);
            }
        }
        int maxNumber=Integer.parseInt(aNum.toString());
        int minNumber=Integer.parseInt(bNum.toString());
        return maxNumber-minNumber;
    }
}