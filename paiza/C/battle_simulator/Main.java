import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int myLevel = sc.nextInt();
        int eLevel;
        
        for (int i = 0; i < count; i++) {
            sc.nextLine();
            eLevel = sc.nextInt();
            if (myLevel > eLevel) {
                myLevel += eLevel / 2;
            } else if (myLevel < eLevel) {
                myLevel /= 2;
            }
        }
        
        System.out.println(myLevel);
    }
}