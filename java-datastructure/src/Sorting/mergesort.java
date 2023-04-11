package Sorting;

public class mergesort {
    // time complexity nlogn


    public static void conqeror(int arr[],int si,int mid,int ei){
        int merged[] = new int[ei-si+1];
        // herer we are combining
        int indx1 = si;
        int indx2 = mid+1;
        int x=0;

        while(indx1 <= mid && indx2 <= ei){
            if(arr[indx1] >= arr[indx2]){
                merged[x++] = arr[indx2++];
            }
            else{
                merged[x++] = arr[indx1++];
            }
        
        }

        //this case is for is one array is biiger and the other is smaller then the raminig element will be merged
        while(indx1 <= mid){
            merged[x++] = arr[indx1++];
        }
        while(indx2 <= ei){
            merged[x++] = arr[indx2++];
        }

        // we are adding to the  orginal array
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i] ;
        }
    }

    public static void divide(int arr[],int si,int ei){

        // for recursion stopping condition
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2; // for space complexity

        // here we are going to divide
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqeror(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8 ,10, 1 , 4}; 
        int n = arr.length;

        divide(arr, 0 , n-1);

        // printing the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
