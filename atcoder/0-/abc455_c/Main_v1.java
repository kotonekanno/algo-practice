import java.util.*;
import java.lang.*;
import java.io.*;

class Main_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Map<Integer, Integer> totalsMap = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            if (totalsMap.containsKey(num)) continue;

            count = 1;
            for (int j = 1; j < n - i; j++) {
                if (nums.get(i + j) != num) continue;
                count ++;
            }

            totalsMap.put(num, num * count);
        }

        List<Integer> totals = new ArrayList<>(totalsMap.values());
        totals.sort(Comparator.naturalOrder());

        int result = 0;
        
        for (int i = 0; i < totals.size() - k; i++) {
            result += totals.get(i);
        }

        System.out.println(result);
    }
}