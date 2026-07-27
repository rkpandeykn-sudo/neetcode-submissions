class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String res = "";
        if (n == 0 || strs == null)
            return res;

        int maxLength = Integer.MAX_VALUE;
        for (String str : strs) {
            maxLength = Math.min(maxLength, str.length());
        }

        int i = 0;
        while (i < maxLength) {
            for (String str : strs) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}