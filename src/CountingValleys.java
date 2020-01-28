import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(5,"UDDDUDUU"));

    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
            int numOfValleys = 0;
            int seaLevel =0;

        for(int i= 0; i<s.length(); i++){
            if(s.charAt(i) == 'U'){
                if(seaLevel == -1)
                    numOfValleys++;
                seaLevel++;
            }
            if(s.charAt(i) == 'D'){
                seaLevel--;
                System.out.println(seaLevel);
            }
        }
            return numOfValleys;
    }
}
