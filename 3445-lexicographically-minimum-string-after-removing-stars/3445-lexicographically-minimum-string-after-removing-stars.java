import java.util.*;

class Solution {
    public String clearStars(String s) {
        // 26 stacks for indices of each char 'a' to 'z'
        Deque<Integer>[] charIndices = new Deque[26];
        for (int i = 0; i < 26; i++) {
            charIndices[i] = new ArrayDeque<>();
        }

        char[] arr = s.toCharArray();

        // Push indices onto stacks for each char, or remove on '*'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                charIndices[arr[i] - 'a'].push(i);
            } else {
                // Remove leftmost smallest char: pop from first non-empty stack
                for (int c = 0; c < 26; c++) {
                    if (!charIndices[c].isEmpty()) {
                        arr[charIndices[c].pop()] = '*';
                        break;
                    }
                }
            }
        }

        // Build result skipping '*'
        StringBuilder result = new StringBuilder();
        for (char ch : arr) {
            if (ch != '*') {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
