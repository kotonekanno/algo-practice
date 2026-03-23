import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int sy = sc.nextInt() - 1;
        int sx = sc.nextInt() - 1;
        sc.nextLine();
        String s = sc.nextLine();
        char[] ss = s.toCharArray();
        int[][] c = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (ss[i] == 'F') {
                sy -= 1;
                System.out.println(c[sy][sx]);
            } else if (ss[i] == 'B') {
                sy += 1;
                System.out.println(c[sy][sx]);
            } else if (ss[i] == 'L') {
                sx -= 1;
                System.out.println(c[sy][sx]);
            } else {
                sx += 1;
                System.out.println(c[sy][sx]);
            }
        }
    }
}