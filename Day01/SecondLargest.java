package GFG160.Day01;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {10, 10, 10};
        System.out.println(getSecondLargest(arr1));
        System.out.println(getSecondLargest(arr2));
        System.out.println(getSecondLargest(arr3));
    }
    static int getSecondLargest(int[] arr) {
        // Code Here
        int max = -1;
        int second_max = -1;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        for (int j : arr) {
            if (second_max < j && j != max) {
                second_max = j;
            }

        }
        return second_max;
    }
}
