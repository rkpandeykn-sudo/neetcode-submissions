class Solution {
    public int climbStairs(int n) {
        int t[] = new int[46];
        Arrays.fill(t, -1);

        if (n <= 2) {
            return n;
        }
        t[0] = 0;
        t[1] = 1;
        t[2] = 2;

        for (int i = 3; i <= n; i++) {
            t[i] = t[i - 2] + t[i - 1];
        }

        return t[n];
    }
}
