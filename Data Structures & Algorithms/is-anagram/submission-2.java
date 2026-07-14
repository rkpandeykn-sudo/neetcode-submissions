//https://leetcode.com/problems/valid-anagram/description/
class Solution {
    // Hash Map
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen)
            return false;

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < slen; i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);
    }
}
