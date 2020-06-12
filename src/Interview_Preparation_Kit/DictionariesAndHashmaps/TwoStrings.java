package Interview_Preparation_Kit.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    //Given two strings, determine if they share a common substring. A substring may be as small as one character.
    //
    //For example, the words "a", "and", "art" share the common substring "a". The words "be" and "cat" do not share a substring.

    public static void main(String[] args) {

    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Set<Character> strSet1 = new HashSet<>();

        for(char c: str1)
        {
            strSet1.add(c);
        }

        for(char c: str2)
        {
            if(strSet1.contains(c))
                return "YES";
        }
        return "NO";
    }
}
