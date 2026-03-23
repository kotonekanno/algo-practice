package paiza.B.stone_piling;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int total = 0;
        int num;
        int[][] c = new int[size][size];
        
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = i; j < size - i; j++) {
                for (int k = i; k < size - i; k++) {
                    c[j][k] += 1;
                }
            }
        }
    
        for (int i = 0; i < size; i++) {
            sc.nextLine();
            for (int j = 0; j < size; j++) {
                num = sc.nextInt();
                total += num - c[i][j];
            }
        }
        
        
        System.out.println(total);
    }
}