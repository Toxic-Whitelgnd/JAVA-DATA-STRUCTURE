package Hashmapset;

import java.util.HashMap;

public class Q5Ans {
    public static void main(String[] args) {
        int arr[] ={10,2,-2,-20,10};
        int k = -10;

        // we have to kkep sum,sum-k and freq
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        int ans = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            // ggoin through the array
           sum += arr[i];

           if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
           }
           if(map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
           }
           else{
            map.put(sum,1);
           }


        }
        System.out.println(ans);
    }
    
}
