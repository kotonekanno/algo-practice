import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.isEmpty() || Pattern.compile("\\s").matcher(input).find()) {
            printError();
            return;
        }

        String[] elements = input.split(",");

        for (String element : elements) {
            if (!Pattern.compile("[A-Z]:\\d+").matcher(element).matches()) {
                printError();
                return;
            }
        }

        Map<String, Integer> logs = new HashMap<>();
        String userId;
        int time;
        for (String element : elements) {
            String[] parts = element.split(":");
            userId = parts[0];
            time = Integer.parseInt(parts[1]);

            if (time < 0) {
                printError();
                return;
            }

            if (logs.containsKey(userId)) {
                time += logs.get(userId);
            }
            logs.put(userId, time);
        }

        int maxTime = 0;
        int tmpTime;
        String maxUserId = null;
        String tmpUserId;
        
        for (Map.Entry<String, Integer> log : logs.entrySet()) {
            tmpTime = log.getValue();
            tmpUserId = log.getKey();
            
            if (maxUserId == null || tmpTime > maxTime || (tmpTime == maxTime && tmpUserId.compareTo(maxUserId) < 0)) {
                maxTime = tmpTime;
                maxUserId = tmpUserId;
            }
        }

        System.out.println(maxUserId + ":" + maxTime);
    }

    public static void printError() {
        System.out.println("error");
    }
}