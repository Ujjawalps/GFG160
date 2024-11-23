package GFG160.Day01_02_03_04;

import java.util.Arrays;

public class AllZerosToEnd {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {0, 0};
        pushZerosToEnd(arr1);
        System.out.println(Arrays.toString(arr1));
        pushZerosToEnd(arr2);
        System.out.println(Arrays.toString(arr2));
        pushZerosToEnd(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    static void pushZerosToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
}
