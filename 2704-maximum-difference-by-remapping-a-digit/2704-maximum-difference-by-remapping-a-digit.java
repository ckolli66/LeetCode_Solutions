// class Solution {
//     public int minMaxDifference(int num) {
//         String s = Integer.toString(num);
//         char replaceMaxNumber=' ';
//         char replaceMinNumber=' ';
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)!='9')
//             {
//                 replaceMaxNumber=s.charAt(i);
//                 break;
//             }
//         }
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)!='0')
//             {
//                 replaceMinNumber=s.charAt(i);
//                 break;
//             }
//         }
//         String afterMaxNumber = s;
//         String afterMinNumber = s;
//         StringBuilder modifiedMax = new StringBuilder(afterMaxNumber);
//         StringBuilder modifiedMin = new StringBuilder(afterMinNumber);

//         for (int i = 0; i < modifiedMax.length(); i++) {
//             if (modifiedMax.charAt(i) == replaceMaxNumber) {
//             modifiedMax.setCharAt(i, '9');
//             }
//             if (modifiedMin.charAt(i) == replaceMinNumber) {
//             modifiedMin.setCharAt(i, '0');
//             }
//         }

//         afterMaxNumber = modifiedMax.toString(); 
//         afterMinNumber = modifiedMin.toString(); 
        

//         return Integer.parseInt(afterMaxNumber)-Integer.parseInt(afterMinNumber);
//     }
// }

class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        char replaceMaxNumber = ' ';
        char replaceMinNumber = ' ';

        // Single loop to find both characters to replace
        for (int i = 0; i < s.length(); i++) {
            if (replaceMaxNumber == ' ' && s.charAt(i) != '9') {
                replaceMaxNumber = s.charAt(i);
            }
            if (replaceMinNumber == ' ' && s.charAt(i) != '0') {
                replaceMinNumber = s.charAt(i);
            }
            if (replaceMaxNumber != ' ' && replaceMinNumber != ' ') {
                break;
            }
        }

        StringBuilder modifiedMax = new StringBuilder(s);
        StringBuilder modifiedMin = new StringBuilder(s);

        if (replaceMaxNumber != ' ') {
            for (int i = 0; i < modifiedMax.length(); i++) {
                if (modifiedMax.charAt(i) == replaceMaxNumber) {
                    modifiedMax.setCharAt(i, '9');
                }
            }
        }

        if (replaceMinNumber != ' ') {
            for (int i = 0; i < modifiedMin.length(); i++) {
                if (modifiedMin.charAt(i) == replaceMinNumber) {
                    modifiedMin.setCharAt(i, '0');
                }
            }
        }

        int maxVal = Integer.parseInt(modifiedMax.toString());
        int minVal = Integer.parseInt(modifiedMin.toString());

        return maxVal - minVal;
    }
}
