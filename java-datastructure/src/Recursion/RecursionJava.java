package Recursion;

import java.util.HashMap;
import java.util.HashSet;

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

    //ans 4
    public static boolean isSorted(int arr[],int idx){
        // base case
        if(idx == arr.length - 1){
            return true;
        }

        if(arr[idx] >= arr[idx+1]){
            return false;
        }

        return isSorted(arr, idx+1);
    } 

    // ans 5
    public static void Moveallx(String str,int idx,String newString , int count){
            if(idx == str.length()){
                for(int i=0;i<count;i++){
                    newString += 'x';
                }
                System.out.println(newString);
                return;
            }

            if(str.charAt(idx) == 'x'){
                count++;
                Moveallx(str, idx+1, newString, count);
            }
            else{
                newString += str.charAt(idx);
                Moveallx(str, idx+1, newString, count);
            }
    }
    
    // 6 ans
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicats(String str,String newString,int idx){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a']) // return if 'a'-'a' = 0 , 'b'-'a' = 1
        {
            // for true case
            RemoveDuplicats(str, newString, idx+1);
        }
        else{
            newString += currchar;
            map[currchar - 'a'] = true;
            RemoveDuplicats(str, newString, idx+1);
        }
    }

    // ans 7
    public static void SubSequences(String str,int idx , String newString){

        if(str.length() == idx){
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        SubSequences(str, idx+1, newString+currchar);

        SubSequences(str, idx+1, newString);
    }

    // ans 8
    public static void SubSequenceswithnorep(String str,int idx , String newString,HashSet<String> set){
        
        if(str.length() == idx){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currchar = str.charAt(idx);


        SubSequenceswithnorep(str, idx+1, newString+currchar, set);

        SubSequenceswithnorep(str, idx+1, newString, set);
    }

    // ans 9 
    public static String mapping[] = {".","abc","def","jkl","mno","pqrs","tu","vwx","yz"};
    public static void KeypadComb(String str,int idx,String combination){

        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currchar = str.charAt(idx);
        String mapp = mapping[currchar - '0'];

        for(int i=0;i<mapp.length();i++){
            char s = mapp.charAt(i);
            KeypadComb(str, idx+1, combination+s);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        // towerofHanoi(n, "S", "H", "D");

        String str = "abcd";
        // printRev(str, str.length()-1);

        String str1 = "abaaabcdaanfaadf";
        findFirstLastOcc(str1, 0, 'a');
       
        int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr, 0));

        String str2 = "axbdxbxss";
        Moveallx(str2, 0, "", 0);

        String str3 = "aabbcdeerrsw";
        RemoveDuplicats(str3,"", 0);

        String str4 = "abc";
        SubSequences(str4, 0, "");

        String str5 = "aaa";
        HashSet<String> set = new HashSet<String>();
        SubSequenceswithnorep(str5, 0, "",set);

        String str6 = "23";
        KeypadComb(str6, 0, "");
    }
}
