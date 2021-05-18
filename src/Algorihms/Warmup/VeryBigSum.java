package Algorihms.Warmup;

/*

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
aVeryBigSum has the following parameter(s):
    * An array of integers
* */

public class VeryBigSum {

    public static void main(String[] args) {
        long[] ar = {1000001, 1000001, 1000001, 1000001, 1000001};
        System.out.println(aVeryBigSum(ar));
    }

    private static long aVeryBigSum(long[] ar)
    {
        long sum=0;
        for (long e: ar) { sum+=e; }
        return sum;
    }

}
