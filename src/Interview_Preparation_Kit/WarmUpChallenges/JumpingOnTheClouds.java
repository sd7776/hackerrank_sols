package Interview_Preparation_Kit.WarmUpChallenges;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Integer[] arr = {0, 0, 1, 0, 0, 1, 0};
        List<Integer> c = Arrays.asList(arr);
        System.out.println(jumpingOnClouds(c));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(List<Integer> c) {
        //Integer[] clouds = (Integer[]) c.toArray();
        int jump=0;
        int position = 0;
        //start at the beginning of the cloud.
        while(position < c.size()){
        //Check whether you can jump two clouds
            if(position<c.size()-2) {
                //If you can jump two clouds go for it
                if (c.get(position + 2) != 1) {
                    position += 2;
                    jump++;
                    //System.out.println("jumping to: " + position);
                }
                //Otherwise check whether you can jump one place
                else if (c.get(position + 1) != 1) {
                    position++;
                    jump++;
                    //System.out.println("jumping to: " + position);
                }
                //You cannot jump anywhere now
                else {
                    //System.out.println("game over");
                    break;
                }
            }
            //Check if you can jump one cloud
           else if(position<c.size()-1){
               //Check if you can jump over the next cloud
                if (c.get(position + 1) != 1) {
                    position++;
                    jump++;
                    //System.out.println("jumping to: " + position);
                } else {
                    //System.out.println("game over");
                    break;
                }
            }
           if(position == c.size()-1){
               break;
           }
        }
        //System.out.println(position);
        return jump;
    }
}
