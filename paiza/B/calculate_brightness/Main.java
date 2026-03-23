import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][][] brightnesses = new int[3 * N][3 * N][3 * N];
        
        for (int i = 0; i < 3 * N; i++) {
            for (int j = 0; j < 3 * N; j++) {
                for (int k = 0; k < 3 * N; k++) {
                    brightnesses[k][j][i] = sc.nextInt();
                }
            }
        }

        int total = 0;
        int max = 0;
        for (int i = 0; i <= 3 * N - 3; i += 3) {
            for (int j = 0; j <= 3 * N - 3; j += 3) {
                for (int k = 0; k <= 3 * N - 3; k += 3) {
                    total = 0;
                    for (int fi = 0; fi < 3; fi++) {
                        for (int fj = 0; fj < 3; fj++) {
                            for (int fk = 0; fk < 3; fk++) {
                                total += brightnesses[k + fk][j + fj][i + fi];
                            }
                        }
                    }
                    if (total > max) {
                        max = total;
                    }
                }
            }
        }
        
        System.out.println(max);
        }
}