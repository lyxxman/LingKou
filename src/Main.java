import java.util.*;

public class Main {

    public static void main(String[] args) {
        int length = lengthOfStr("pwwkew");
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static int lengthOfStr(String s) {
        int maxLength = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char pre = s.charAt(i);
            if (!list.contains(pre)) {
                list.add(pre);
            } else {
                list.clear();
            }
            maxLength = Math.max(maxLength, list.size());
    }
        return maxLength;
}

    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1; //滑动窗口下一个下标
        }
        return ans;
    }
}
