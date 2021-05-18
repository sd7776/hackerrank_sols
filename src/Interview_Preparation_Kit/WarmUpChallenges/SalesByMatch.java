package Interview_Preparation_Kit.WarmUpChallenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SalesByMatch
{
    //Naive way
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs=0;
        Map<Integer,Integer> counts = new HashMap();
        for (int i= 0; i<ar.size(); i++)
        {
            if(counts.containsKey(ar.get(i)))
            {
                counts.put(ar.get(i), counts.get(ar.get(i)) + 1);
            }
            else
            {
                counts.put(ar.get(i),1);
            }
        }
        System.out.println(counts);
        for (Map.Entry<Integer, Integer> key : counts.entrySet())
        {
            pairs+=key.getValue()/2;
            //pairs++;
        }
        System.out.println(pairs);
        return pairs;
    }

    //Better - One pass
    public static int sockMerchant2(int n, List<Integer> ar) {
        int pairs=0;
        Integer[] arr = (Integer[])ar.toArray();
        Set<Integer> colors = new HashSet<>(); //Using Hashset for collecting unique values

        for(int i=0; i<n; i++)
        {
            if(!colors.contains(arr[i]))//Add the color if it's unique
            {
                colors.add(arr[i]);
            }
            else //Count as pair and remove the color if it exists
            {
                pairs++;
                colors.remove(arr[i]);
            }
        }

        return pairs;
    }

    public static void main(String[] args)
    {
        int pairs=0;
        Integer[] arr = {1,2,1,2,1,3,2,2,2,2,3};
        List<Integer> ar = Arrays.asList(arr);
        //System.out.println(sockMerchant(arr.length, ar));
        System.out.println(sockMerchant2(arr.length, ar));
    }
}
