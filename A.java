import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
            System.out.println("Enter the row and column size");
            //Scanner ss=new Scanner(System.in);
            int row=ss.nextInt();
            int col=ss.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0&&j==1||i==2&&j==0||i==2&&j==2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }ss.close();
        for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            if(i==0||j==0||j==4){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }System.out.println();
        }
    }
}
