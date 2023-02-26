// public class Two {
//     public static void main(String[] args) {
        
//     for(int i=0; i<5; i++){
//         for(int j=0; j<5; j++){
//             if(i==0||i==2||i==4||i==1&&j==4||i==3&&j==0){
//                 System.out.print("*");
                
//             }else{
//                 System.out.print(" ");
//             }
//         }System.out.println();
//     }
// }
// }
    

public class Two {
    public static void main(String[] args) {
        int n=10;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==0||i==n/2||i==n-1||i<=n/2&&j==n-1||i>=n/2&&j==0){
                System.out.print("*");
                
            }else{
                System.out.print(" ");
            }
        }System.out.println();
    }
}
}
    