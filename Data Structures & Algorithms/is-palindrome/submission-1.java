class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0, r = n - 1;

        while (l < r) {
            while (l < r && !isAlphanumeric(s.charAt(l))) l++;

            while (r > l && !isAlphanumeric(s.charAt(r))) r--;

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            l++;
            r--;
        }
        return true;
    }

    boolean isAlphanumeric(char ch) {
        return (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9'));
    }
}
