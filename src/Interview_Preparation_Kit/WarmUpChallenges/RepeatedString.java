package Interview_Preparation_Kit.WarmUpChallenges;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("abaa", 10));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        //find how many A is in the initial string
        long occurA1 = 0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)=='a')
                occurA1++;
        }

        //find the maximum number of the given string can fit inside the given n
        long multiplier = n/s.length();

        //find how many a will be inside the last remainder string
        long occurA2=0;
        for(int i=0; i< n % s.length(); i++){
            if(s.charAt(i)=='a')
                occurA2++;
        }

        return occurA1*multiplier+occurA2;
    }
}
