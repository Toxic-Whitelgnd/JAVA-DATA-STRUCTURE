package Recursion;

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

    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str, "");

        int n=3,m = 3;
        System.out.println(TotalPathMAze(1, 1, n, m));
        
    }
}
