class Solution {
    public boolean isAnagram(String s, String t) {
        int xor = 0;
        int n[] = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            n[s.charAt(i) - 'a']++;
            n[t.charAt(i) - 'a']--;
        }
        return Arrays.stream(n).allMatch(m -> m == 0);
    }
}
