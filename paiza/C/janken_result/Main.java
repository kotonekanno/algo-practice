import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int score = 0;
        String line;
        String[] hands = new String[2];
        
        count = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < count; i++) {
            line = sc.nextLine();
            hands = line.split(" ");
            if ((hands[0].equals("G") && hands[1].equals("C")) || (hands[0].equals("C") && hands[1].equals("P")) || (hands[0].equals("P") && hands[1].equals("G"))) {
                score++;
            }
        }
        
        System.out.println(score);
    }
}