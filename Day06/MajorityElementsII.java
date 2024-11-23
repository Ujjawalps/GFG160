package GFG160.Day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementsII {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr1));

    }
    public static List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }

        result.sort(Integer::compareTo);

        return result;
    }
}
