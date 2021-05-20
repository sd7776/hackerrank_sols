package Interview_Preparation_Kit.WarmUpChallenges;

public class CountingValeys
{
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int currentLevel = 0;
        if(path.length() != steps)
        {
            System.out.println("The steps and path need to match");
        }
        else if(path.chars().filter(ch -> ch == 'U').count() != path.chars().filter(ch -> ch == 'D').count()){
            System.out.println("They need to start and end at the sea level");
        }
        else
        {
            for (int i = 0; i < steps; i++)
            {
                if (path.charAt(i) == 'D')
                {
                    if (currentLevel == 0)//If I'm going down, I must go through a valley
                    {
                        valleys++;
                    }
                    currentLevel--;
                }
                else
                {
                    currentLevel++;
                }
            }
            //System.out.println(valleys);
        }
        return valleys;
    }

    public static void main(String[] args)
    {
        countingValleys(10, "DDUDUDUUDU" );
    }
}
