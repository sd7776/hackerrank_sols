public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(arr));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jump=0;
        int position = 0;
        while(position < c.length){
        //start at the beginning of the cloud.
        //If the cloud is a thundercloud(1) try jumping 2 clouds
            if(position<c.length-2) {
                if (c[position + 2] != 1) {
                    position += 2;
                    jump++;
                    System.out.println("jumping to: " + position);
                } else if (c[position + 1] != 1) {
                    position++;
                    jump++;
                    System.out.println("jumping to: " + position);
                } else {
                    System.out.println("game over");
                }
            }
           else if(position<c.length-1){
                if (c[position + 1] != 1) {
                    position++;
                    jump++;
                    System.out.println("jumping to: " + position);
                } else {
                    System.out.println("game over");
                }
            }
           if(position == c.length-1){
               break;
           }
        }
        System.out.println(position);
        return jump;
    }
}
