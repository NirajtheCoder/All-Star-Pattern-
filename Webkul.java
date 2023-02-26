import java.util.Scanner;

public class Webkul {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter row and colum size");
        int row = ss.nextInt();
        int colum = ss.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (j == 0 || i == colum-1 || j == row-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == row/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i + j == 7 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
