/*
    Leetcode Link   : https://leetcode.com/problems/valid-anagram/description/
*/
class Solution {
    // Approach: Hash Table (Using Array)
    public boolean isAnagram(String s, String t) {
        int n[] = new int[26];
        for (char ch : s.toCharArray()) {
            n[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            n[ch - 'a']--;
        }
        return Arrays.stream(n).allMatch(m -> m == 0);
    }
}
