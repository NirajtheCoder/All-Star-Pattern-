import java.util.Scanner;

public class Anmol {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=ss.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
              for(int j=n; j>i; j--){
                System.out.print("*");
              }
                for(int j=n-1; j>i; j--){
                    System.out.print("*");
                }
            System.out.println();
        }
        ss.close();
    }
}
