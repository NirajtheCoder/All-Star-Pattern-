public class Ninezero {
    public static void main(String[] args) {
    int n=9;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==0||j==n-1||i==n-1||i<=n/2&&j==0||i==n/2){
                System.out.print("*");
            }else{
                System.err.print(" ");
            }
        }
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       

    } 
      
}
}
