package ai_generated.orders_fee;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.isEmpty() | Pattern.compile("\\s").matcher(input).find()) {
            System.out.println("error");
            return;
        }

        String[] orders = input.split(",");

        boolean flag = true;
        for (String order : orders) {
            if (!Pattern.compile("[^:]+:\\d+:\\d+").matcher(order).matches()) {
                flag = false;
                return;
            }
        }
        if (!flag) {
            System.out.println("error");
            return;
        }

        int total = 0;

        for (String order : orders) {
            String[] elements = order.split(":");
            int price = Integer.parseInt(elements[1]);
            int amount = Integer.parseInt(elements[2]);

            total += price * amount;
        }

        System.out.println(total);
    }
}