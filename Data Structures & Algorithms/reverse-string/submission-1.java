class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0, r = n - 1;
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