import java.util.Arrays;

public class LeftRotaion {

    public static void main(String[] args) {
        int[] newArray = {1,4,6,4,3,8};
        System.out.println(Arrays.toString(rotLeft(newArray,5)));
    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] newArray = new int[a.length];

        //[1,4,6,4,3,8] --> 5 left --> [8,1,4,6,4,3]
        //[1,15,3,6,6,9] --> 6 left --> [1,15,3,6,6,9]
        //[0,1,2,3,4,5] --> 6 left --> [0+(len(arr)-6)]
        //get each element in the array
        for(int i =0; i< a.length; i++){
            if(i<d){
                newArray[i-d+a.length] = a[i];
            }
            else{
                newArray[(i-d+a.length)%a.length] = a[i];
            }
        }
        return newArray;
    }
}
