import java.util.Scanner;

class Webl {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter The size");
        int n = ss.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for(int i=0; i<n; i++){
        // for(int j=0; j<i; j++){
        // System.out.print(" ");
        // }
        // for(int j=n; j>i; j--){
        // System.out.print("*");
        // }
        // for(int j=5; j>i; j--){
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > (i * 2); j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        ss.close();
    }
}