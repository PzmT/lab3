import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackPack {
    public static int optimizing(int[] w, int[] v, int limit) {
        int n = w.length;
        int[][] dp = new int[n + 1][limit + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= limit; j++) {
                if (j < w[i-1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i-1]] + v[i-1]);
                }
            }
        }
        return dp[n][limit];
    }
}