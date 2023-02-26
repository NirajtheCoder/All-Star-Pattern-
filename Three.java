public class Three {
    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(i==0||j==n-1||i==n/2||i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
