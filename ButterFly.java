public class ButterFly {
    public static void main(String[] args) {
    for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
         
        int space=2*(5-1);
        for(int j=1; j<=space; j++){
            System.out.print("*");
            
        }
        System.out.println();
    }
    }
}
