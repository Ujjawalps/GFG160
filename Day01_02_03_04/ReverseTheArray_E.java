package GFG160.Day01_02_03_04;

import java.util.Arrays;

public class ReverseTheArray_E {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, 2, 6, 5};
        int[] arr2 = {4, 5, 2};
        int[] arr3 = {1};
        reverseArray(arr1);
        System.out.println(Arrays.toString(arr1));
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
        reverseArray(arr3);
        System.out.println(Arrays.toString(arr3));

    }
    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
