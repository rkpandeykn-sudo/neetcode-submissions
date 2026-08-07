class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (set.contains(ch))
                    break;

                set.add(ch);
            }
            res = Math.max(res, set.size());
        }
        return res;
    }
}
