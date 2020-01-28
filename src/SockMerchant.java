import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SockMerchant {
    public static void main(String[] args) {
        int[] arr = {10,20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(4, arr));
    }
    static int sockMerchant(int n, int[] ar) {
        Integer sockPairs = 0;
        int count=0;
        HashMap<Integer, Integer> colors = new HashMap();
        for (int color: ar) {
            if(colors.get(color) == null) {
                colors.put(color, ++count);
                count=0;
            }
            else{
                colors.put(color, colors.get(color)+1);
            }
        }
        //System.out.println(colors.entrySet());
        for(Map.Entry<Integer, Integer> entry: colors.entrySet()){
            sockPairs+=(entry.getValue()/2);
        }
        return sockPairs;
    }
}
