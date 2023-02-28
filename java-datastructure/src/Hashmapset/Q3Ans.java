package Hashmapset;

import java.util.*;

public class Q3Ans {

    public static int Intersection2Arr(int arr1[],int arr2[]){  
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,5,5,2,1,1};
        int arr2[] = {4,5,6,2,3,1,7,5,4,9,5};

        System.out.println(Intersection2Arr(arr1, arr2));
        
    }
}
