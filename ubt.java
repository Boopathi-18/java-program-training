import java.util.*;

public class ubt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 1;
        if (n >= 1) {
            dp[1] = 1;
        }

        for (int nodes = 2; nodes <= n; nodes++) {
            for (int root = 1; root <= nodes; root++) {
                dp[nodes] += dp[root - 1] * dp[nodes - root];
            }
        }

        System.out.println(dp[n]);
    }
}