package Hashmapset;

import java.util.*;

public class Q2Ans {

    public static int Union2Arr(int arr1[],int arr2[]){

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,2,3,1,7};

        System.out.println(Union2Arr(arr1, arr2));

        
    }
}
