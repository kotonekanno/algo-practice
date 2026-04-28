import java.util.*;
import java.lang.*;
import java.io.*;

class Main_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Map<Integer, Long> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0L) + 1);
        }

        List<Long> totals = new ArrayList<>();
        for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
            totals.add((long)entry.getKey() * entry.getValue());
        }

        totals.sort(Comparator.naturalOrder());

        long result = 0;

        for (int i = 0; i < totals.size() - k; i++) {
            result += totals.get(i);
        }

        System.out.println(result);
    }
}