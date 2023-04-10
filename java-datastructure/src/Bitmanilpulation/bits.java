package Bitmanilpulation;

import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        // get bits (used to check the postion of the bit is one or zero)
        int n =5; //0101
        int pos = 2; 

        int Bitmask = 1<<pos; //leftshifting the 1 to the position
        if((Bitmask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit is one");
        }

        // set bits (used to set the bit position as 0 to 1 or 0 to 1 in the bits)
        int n1 = 5; //0101
        int pos1 = 1;
        int bitmask = 1<<pos1; //leftshifting the 1 to the position
        int newnumber = bitmask | n;
        System.out.println(newnumber);

        // clear the bit (used to clear the bit with the position)
        int n2 = 5;//0101
        int pos2 =2;
        int bitmask2 = 1<<pos2;
        int notbitmask = ~(bitmask2);
        int newnumber2 = notbitmask & n2;
        System.out.println(newnumber2);

        // updatebit (used to update the bit of n to 1[set] or n to 0 [clear])
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n3 = 5;
        int pos3 = 1;

        int bitmask3 = 1<<pos3; //leftshifting the 1 to the position
        if(oper == 1){
            // set
            int newnumber3 = bitmask3 | n3;
            System.out.println(newnumber3); 
        }
        else{
            int notbitmask3 = ~(bitmask3);
            int newnumber4 = notbitmask3 & n3;
            System.out.println(newnumber4);
        }  

    }
}
