public class One {
    public static void main(String[] args) {
        //public static void main(String[] args) {
            int n=10;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(j==n-1||i<=n/2&&i+j==n/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                }System.out.println();
                   
                //System.out.println();
            }for(int k=0; k<n; k++){
                System.out.print("* ");
            }
        }
    }

