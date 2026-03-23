import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        if (input.isEmpty() || !Pattern.compile("\\d+").matcher(input).matches()) {
            printError();
            return;
        }

        char tmp;
        char tmp2;
        int count;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);
            count = 1;

            int j;
            for (j = i + 1; j < input.length(); j++) {
                tmp2 = input.charAt(j);
                
                if (tmp == tmp2) {
                    count += 1;
                } else {
                    break;
                }
            }

            sb.append(tmp).append(count);
            i = j - 1;
        }

        System.out.println(sb.toString());
    }

    public static void printError() {
        System.out.println("error");
    }
}