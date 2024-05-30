class Solution {
    public static int countWays(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();

        if (n == 0) return 1;
        if (m == 0) return 0;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]%1000000007 + dp[i - 1][j]%1000000007;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n]%1000000007;
    }
}
