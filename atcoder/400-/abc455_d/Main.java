import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[][] piles = new int[N + 1][N];
        int[] locations = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            piles[i][0] = i;
        }

        for (int i = 1; i <= N; i++) {
            locations[i] = i;
        }
        
        for (int i = 0; i < Q; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();

            // カードを取る
            List<Integer> movedCards = new ArrayList<>();
            int location = locations[c];
            boolean flag = false;
            
            for (int j = 0; j < N; j++) {
                int card = piles[location][j];

                if (card == 0) break;

                if (card == c) {
                    flag = true;
                }

                if (flag) {
                    movedCards.add(card);
                    piles[location][j] = 0;
                }
            }

            // カードを積む
            int moveTo = locations[p];
            int startIndex = 0;
            
            for (int j = 0; j < N; j++) {
                if (piles[moveTo][j] == 0) {
                    startIndex = j;
                    break;
                }
            }
            
            for (int j = 0; j < movedCards.size(); j++) {
                int card = movedCards.get(j);
                
                piles[moveTo][startIndex + j] = card;
                locations[card] = moveTo;
            }
        }
        
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int num = 0;
            
            for (int j = 0; j < N; j++) {
                if (piles[i][j] != 0) {
                    num += 1;
                }
            }

            result.append(num);

            if (i != N) result.append(" ");
        }

        System.out.println(result);
    }
}
