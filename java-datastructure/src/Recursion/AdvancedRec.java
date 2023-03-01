package Recursion;

import java.util.ArrayList;

public class AdvancedRec {

    // ans 10
    public static void PrintPermutation(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            PrintPermutation(newstr, permutation+currchar);
        }
    }

    // ans 11
    public static int TotalPathMAze(int i,int j,int n,int m){
        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        int downpath = TotalPathMAze(i+1, j, n, m);

        int leftpath = TotalPathMAze(i,j+1,n,m);

        return downpath+leftpath;
    }

    // ans 13
    public static int CallGuests(int n){

        if(n <= 1){
            return 1;
        }

        int way1 = CallGuests(n-1);

        int way2 = (n-1)*CallGuests(n-2);

        return way1+way2;
    }

    // ans 14
    public static void printsub(ArrayList<Integer> sub){
        for(int i=0;i<sub.size();i++){
            System.out.print(sub.get(i));
        }
        System.out.println();
    }

    public static void PrintSubset(int n,ArrayList<Integer> subset){
        
        if(n == 0){
            printsub(subset);
            return;
        }

        subset.add(n);
        PrintSubset(n-1, subset);

        subset.remove(subset.size()-1);
        PrintSubset(n-1, subset);

    }

    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str, "");

        int n=3,m = 3;
        System.out.println(TotalPathMAze(1, 1, n, m));

        int n1 = 4;
        System.out.println(CallGuests(n1));

        int n2 = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        PrintSubset(n2, subset);
        
    }
}
