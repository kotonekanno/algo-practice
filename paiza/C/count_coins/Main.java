import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int total = 0;
        int[] coins = new int[6];
        coins[0] = 500;
        coins[1] = 100;
        coins[2] = 50;
        coins[3] = 10;
        coins[4] = 5;
        coins[5] = 1;
        
        for (int coin : coins) {
            total += (price / coin);
            price %= coin;
        }
        
        System.out.println(total);
    }
}