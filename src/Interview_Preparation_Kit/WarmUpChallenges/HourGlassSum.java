package Interview_Preparation_Kit.WarmUpChallenges;

import java.util.ArrayList;

public class HourGlassSum {
    public static void main(String[] args) {
        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        System.out.println(hourglassSum(arr));
    }
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int maxSum= Integer.MIN_VALUE;
        ArrayList<Integer> hourGlass = new ArrayList<>();
        //iterate through the 2D array
        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr.length-2; j++){

                    int nSum = arr[i][j]+ arr[i][j + 1] + arr[i][j + 2]
                                        +arr[i+1][j+1]
                            +arr[i+2][j] + arr[i+2][j + 1] + arr[i+2][j + 2];

                if(maxSum < nSum)
                    maxSum =nSum;
            }
        }
        return maxSum;
    }

    static void betterForLoop(){

    }
}
