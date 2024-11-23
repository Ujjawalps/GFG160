package GFG160.Day09;

import java.util.Arrays;

public class MinimizeTheHeights_I {
    public static void main(String[] args) {
        int[] arr = {-70, -59, 83, 16, 61, 19};
        int k = 80;
        System.out.println(MinimizedHeight(arr, k));
    }
    static int MinimizedHeight(int[] arr, int k){

        Arrays.sort(arr);
        int n = arr.length;
        int diff = arr[n - 1] - arr[0];
        int smallest, largest;
        for (int i = 0; i < n - 1; i++) {
            smallest = Math.min(arr[0] + k, arr[i + 1] - k);
            largest = Math.max(arr[i] + k, arr[n - 1] - k);

            diff = Math.min(diff, largest - smallest);
        }

        return diff;
    }

}
