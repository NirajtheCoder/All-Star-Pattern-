import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=ss.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=5; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }ss.close();
    }
}
