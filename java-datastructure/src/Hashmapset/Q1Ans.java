package Hashmapset;

import java.util.*;

public class Q1Ans {

    public static void MajorityEement(int nums[]){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<n; i++){
            // contains key is for if the key already exists it returs true else false
            if(map.containsKey(nums[i])){
                // true condition so inc the freq

                // put is for addding the key and value
                // get is to get the value by key
                map.put(nums[i], map.get(nums[i])+1);

            }
            else{
                // false condition so create new vkv pair
                map.put(nums[i],1);
            }
        }

        // this part is for getting the more than n/3 
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; 

        MajorityEement(nums);
    }
}