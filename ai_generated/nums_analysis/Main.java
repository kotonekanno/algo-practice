import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.isEmpty() || !Pattern.compile("-?\\d+(,-?\\d+)*").matcher(input).matches()) {
            System.out.println("error");
            return;
        }
        
        String[] parts = input.split(",");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            try {
                nums[i] = Integer.parseInt(parts[i]);
            } catch (Exception e) {
                System.out.println("error");
                return;
            }
        }
        
        int max = nums[0];
        int min = nums[0];
        int total = 0;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }

            total += i;
        }

        System.out.println(min + "," + max + "," + total / nums.length);
    }
}