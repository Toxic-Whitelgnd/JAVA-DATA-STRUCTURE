package Recursion;

public class RecursionJava {

    // 1 ans
    public static void towerofHanoi(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("transfer of disk"+n+"from "+src +" to "+dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer of disk"+n+"from "+src +" to "+dest);
        towerofHanoi(n-1, helper, src, dest);
    }

    // 2 ans
    public static void printRev(String str,int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
        
    }

    //  3 ans
    public static int first = -1;
    public static int last = -1;
    public static void findFirstLastOcc(String str,int idx,char element){
        // base condition
        if(idx == str.length()){
            System.out.println(first+" "+last);
            return;
        }

        if(str.charAt(idx) == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findFirstLastOcc(str, idx+1, element);
    }
    

    public static void main(String[] args) {
        int n = 3;
        // towerofHanoi(n, "S", "H", "D");

        String str = "abcd";
        // printRev(str, str.length()-1);

        String str1 = "abaaabcdaanfaadf";
        findFirstLastOcc(str1, 0, 'a');
       
    }
}
