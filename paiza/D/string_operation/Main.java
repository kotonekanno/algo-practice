import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String output = line.substring(1, line.length() - 1);
        
        System.out.println(output);
    }
}