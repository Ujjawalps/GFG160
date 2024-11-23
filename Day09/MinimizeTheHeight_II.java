package GFG160.Day09;

import java.util.Arrays;

public class MinimizeTheHeight_II {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        System.out.println(getMinDiff(arr, k));
    }
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int diff = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int smallest = Math.min(arr[0] + k, arr[i + 1] - k);
            int largest = Math.max(arr[i] + k, arr[n - 1] - k);

            if (smallest < 0) continue;

            diff = Math.min(diff, largest - smallest);
        }

        return diff;
    }
}
