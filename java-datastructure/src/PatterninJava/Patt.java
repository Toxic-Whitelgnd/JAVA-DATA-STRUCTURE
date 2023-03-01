package PatterninJava;

public class Patt{

    // ans 1
    public static void Ans1(int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ans 2
    public static void Ans2(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ans 3
    public static void Ans3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ANS 4
    public static void Ans4(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ANS 5
    public static void Ans5(int n){
        for(int i=1;i<=n;i++){
            // this is for INNER SPACES
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // this is for printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Ans 6
    public static void Ans6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Ans 7
    public static void Ans7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<= (n-i+1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // ANs 8
    public static void Ans8(int n){
        int k =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    // ans 9
    public static void Ans9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // ans 1
        int n = 4, m = 5;
        Ans1(n, m);
        System.out.println();
        // ANS 2
        Ans2(n, m);
        System.out.println();
        // ANS 3
        int n1 = 4;
        Ans3(n1);
        System.out.println();
        // ANS 4
        Ans4(n1);
        // ANS 5
        Ans5(n1);
        System.out.println();
        // Ans 6
        int n2 = 5;
        Ans6(n2);
        System.out.println();
        // Ans 7
        Ans7(n2);
        System.out.println();
        // Ans 8
        Ans8(n2);
        System.out.println();
        // Ans 9
        Ans9(n2);

    }
}



