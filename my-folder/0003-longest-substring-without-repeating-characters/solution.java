import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startFirst = 0, tekLength = 0, maxim = 0;
        HashSet<Character> nabor = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (nabor.contains(s.charAt(i))) {
                // описываем логику если встретился повторяющийся символ
                if (tekLength > maxim) {
                    maxim = tekLength;
                }
                // удаляем из множества символы, которые были до первого символа новой подстроки
                for (int j = startFirst; j < i; j++) {   // возможно  tekPosition можно заменить на i
                    if (s.charAt(j) == s.charAt(i)) {
                        startFirst = j + 1;
                        tekLength = i - j;
                        break;
                    } else {
                        nabor.remove(s.charAt(j));
                    }
                }
            } else {
                // описываем логику, что строка продолжается
                nabor.add(s.charAt(i));
                tekLength++;
            }
        }
        if (tekLength > maxim) {
            maxim = tekLength;
        }
        return maxim;
    }
}
