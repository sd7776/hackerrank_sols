package Algorihms.Warmup;
/*
Find comparison points by comparing a[0] with b[0] and a[1] with b[1] etc..
If a[i] > b[i] then Alice receives 1 point
If a[i] < b[i] then Bob receives 1 point
If a[i] = b[i] then no one receives any point

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):
a: an array of integers representing Alice's challenge rating
b: an array of integers representing Bob's challenge rating

Input Format
The first line contains 3 space-separated integers, a[0],a[1], and a[2], describing the respective values in triplet a.
The second line contains  space-separated integers, b[0], b[1], and b[2], describing the respective values in triplet b.

Constraints:
1<= a[i] <= 100
1<= b[i] <= 100

Output format:
Return an array of two integers denoting the respective comparison points earned by Alice and Bob.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,6,7));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3,6,10));

        System.out.println(compareTriplets(a, b));
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> results = new ArrayList<>();

        if(a.size() != b.size()) {
            System.out.println("The array size must be ");
            return null;
        }
        int alice =0 , bob = 0;

        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i) > b.get(i))
            {
                alice++;
            }
            if(a.get(i) < b.get(i))
            {
                bob++;
            }
        }
        results.add(alice);
        results.add(bob);
        return results;
    }
}
