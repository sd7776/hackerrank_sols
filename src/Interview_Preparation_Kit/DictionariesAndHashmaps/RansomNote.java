package Interview_Preparation_Kit.DictionariesAndHashmaps;

//Given a magazine is it possible to create the expected ransom note?
//Full problem at: https://www.johncanessa.com/2017/02/09/hash-tables-ransom-note/

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {

        String[] magazine = {"two", "times", "three", "is" ,"not" , "four"};
        String[] note = {"two", "times", "two" ,"is" , "four"};
        checkMagazine(magazine,note);
    }

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean yes = false;
        HashMap<String, Integer> wordsInMag = new HashMap<String, Integer>();
        for(String word: magazine)
        {
            int count;
            if(wordsInMag.containsKey(word))
            {
                count = wordsInMag.get(word);
                count++;
            }
            else
            {
                count = 1;
            }
            wordsInMag.put(word, count);
        }
        //System.out.println(wordsInMag.toString());
        for(String word: note)
        {
            int count;
            if(wordsInMag.containsKey(word))
            {
                count = wordsInMag.get(word);
                count--;
                wordsInMag.put(word, count);
                if(count < 0)
                {
                    yes = false;
                    break;
                }
                else {
                    yes = true;
                }
            }
            else{
                yes = false;
                break;
            }
        }

        if(!yes){
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}

