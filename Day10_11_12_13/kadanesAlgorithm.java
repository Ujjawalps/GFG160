package GFG160.Day10_11_12_13;

import java.util.*;
import java.lang.*;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 7, 8};
        System.out.println(maxSubarraySum(arr));
    }
    static int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }


        }
        return max;
    }
}
