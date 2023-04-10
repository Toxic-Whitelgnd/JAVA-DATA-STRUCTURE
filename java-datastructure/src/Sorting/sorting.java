package Sorting;

public class sorting {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // values
        int arr[] = {7,8,3,2,1};

        // time complexity O(n^2)
        // Bubble sort (swap with neigbor element)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);

        // selection sort (taking the smallest element and putting in front per iteration )
        for(int i=0;i<arr.length-1;i++) {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }

                // swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            
        }
        printArr(arr); 

        // insertion sort (dividing the array int otwo part sorted and unsorted | comparing the unsorted to sorted  )
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1; //sorted part
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }    
            // placement
            arr[j+1] = current;
         }
         printArr(arr);
}
}
