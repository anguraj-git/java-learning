import java.util.Arrays;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "a" };
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        System.out.println(last);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < first.length - 1; i++) {
            if (first[i] != last[i])
                break;
            sb.append(first[i]);
        }
        System.out.println(sb.toString());
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for (String s : strs) {
            if (s != null && s != " " && s != "") {
                common = fetchCommon(common, s);
            }
        }
        return common;
    }

    public String fetchCommon(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        StringBuffer sb = new StringBuffer();
        int minLength = Math.min(c1.length, c2.length);
        for (int i = 0; i < minLength; i++) {
            if (c1[i] != ' ') {
                if (c2[i] != ' ') {
                    if (c1[i] == c2[i]) {
                        sb.append(c1[i]);
                    } else {
                        break;
                    }
                }
            }

        }
        return sb.toString();
    }
}