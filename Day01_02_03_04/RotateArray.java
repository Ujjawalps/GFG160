package GFG160.Day01_02_03_04;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d1 = 3;
        rotateArr(arr1, d1);
        System.out.println(Arrays.toString(arr1));

    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
