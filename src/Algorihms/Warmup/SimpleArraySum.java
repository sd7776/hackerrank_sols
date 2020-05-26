package Algorihms.Warmup;

import java.util.Arrays;

public class SimpleArraySum {
    //Given an array of integers, find the sum of its elements.
    // If arr = {1,2,3} return 6

    public static void main(String[] args) {
        int[] arr = {1,4,3,6};
        System.out.println("The sum of the array: " + Arrays.toString(arr) + " is: " + sumArr(arr));
    }

    private static int sumArr(int[] arr) {
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
