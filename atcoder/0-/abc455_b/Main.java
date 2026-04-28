import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[][] grid = new int[h][w];
        String line;
        String[] parts = new String[w];

        for (int i = 0; i < h; i++) {
            line = sc.nextLine();
            parts = line.split("");
            
            for (int j = 0; j < w; j++) {
                if (parts[j].equals("#")) {
                    grid[i][j] = 1;
                }
            }
        }

        int result = 0;
        boolean flag = true;

        for (int i = 1; i <= h; i++) {      // 検証範囲の高さ
            for (int j = 1; j <= w; j++) {  // 検証範囲の幅
                for (int k = 0; k < h - i + 1; k++) {         // 検証範囲の垂直方向の位置
                    for (int l = 0; l < w - j + 1; l++) {     // 検証範囲の水平方向の位置
                        flag = true;
                        for (int m = 0; m < i; m++) {                // マスの垂直方向の位置
                            for (int n = 0; n < (j + 1) / 2; n++) {  // マスの水平方向の位置
                                if (grid[m + k][n + l] != grid[k + i - 1 - m][l + j - 1 - n]) {
                                    flag = false;
                                    break;
                                }
                            }
                            if (!flag) break;
                        }
                        if (flag) {
                            result++;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}