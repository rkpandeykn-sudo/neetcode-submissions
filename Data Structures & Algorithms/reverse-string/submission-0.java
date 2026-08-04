class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        char[] temp = new char[r];
        while (l < r) {
            temp[l] = s[l];
            s[l] = s[r];
            s[r] = temp[l];
            l++;
            r--;
        }
    }
}