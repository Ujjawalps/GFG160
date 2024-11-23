package GFG160.Day05;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot (first decreasing element from the right)
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If no pivot found, reverse the entire array
        if (i < 0) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the element just larger than the pivot
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 4: Swap the pivot with the just larger element
        swap(arr, i, j);

        // Step 5: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    // Helper method to reverse elements in an array between two indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
