package PatterninJava;

public class AdvaPatt {

    // ans 10
    public static void Ans10(int n){
        // for upper
        for(int i=1;i<=n;i++){
            // for 1st half stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            // for 2nd half stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        // for lower
        for(int i=n;i>=1;i--){
            // for 1st half stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            // for 2nd half stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ans 11 
    public static void Ans11(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ans 12
    public static void Ans12(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // ans 13
    public static void Ans13(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ans 14
    public static void Ans14(int n){
        // for upper half
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower half
        for(int i=n;i>=1;i--){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // ans 10
        int n=7;
        Ans10(n);

        System.out.println();
        // ans 11
        int n1=5;
        Ans11(n1);

        System.out.println();
        // Ans 12
        Ans12(n1);

        System.out.println();
        // Ans 13
        Ans13(n1);

        System.out.println();
        // ans 14
        Ans14(n1);
    }
}
