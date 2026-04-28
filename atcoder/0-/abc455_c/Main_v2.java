import java.util.*;
import java.lang.*;
import java.io.*;

class Main_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> totals = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            totals.add(entry.getKey() * entry.getValue());
        }

        totals.sort(Comparator.naturalOrder());

        int result = 0;

        for (int i = 0; i < totals.size() - k; i++) {
            result += totals.get(i);
        }

        System.out.println(result);
    }
}