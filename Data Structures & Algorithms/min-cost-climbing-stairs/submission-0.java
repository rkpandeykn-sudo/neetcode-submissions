class Solution {
    int n;
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        n = cost.length;
        dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return Math.min(solve(0, cost), solve(1, cost));
    }

    int solve(int i, int[] cost) {
        if (i >= n)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int op1 = cost[i] + solve(i + 1, cost);
        int op2 = cost[i] + solve(i + 2, cost);

        return dp[i] = Math.min(op1, op2);
    }
}
