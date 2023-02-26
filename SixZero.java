import java.util.Scanner;

public class SixZero {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter The Size"+" ");
        int n=ss.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(j==0||i>=n/2&&j==n-1||i==n/2||i==n-1||i==0&&j<=n/2){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
             for(int j=0; j<4; j++){
                System.out.print(" ");
             }
              for(int j=0; j<n; j++){
                if(i==0||i<=n/2&&j==0||i==n/2||i>=n/2&&j==n-1||i==n-1){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
              }
            System.out.println();
        }ss.close();
    }
}
