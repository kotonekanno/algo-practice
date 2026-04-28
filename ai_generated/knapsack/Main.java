import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 品物の数
        int W = sc.nextInt();  // 最大重量

        int[] weight = new int[N];
        int[] value = new int[N];
        
        for (int i = 0; i < N; i++) {
            sc.nextLine();

            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        int[][] dp = new int[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= W; w++) {
                if (weight[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight[i - 1]] + value[i - 1]);
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}