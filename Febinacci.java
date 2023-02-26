// // public class Febinacci {
//     public static void main(String[] args) {
//         int a=0, b=1;
//        System.out.println(a+" "+" ");
//         for(int i=0; i<10; i++){
//            int c=a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//         }
//     }
// }

class Febinacci{
    public static void main(String[] args) {
        int n=4523,rem,rev=0;
        while(n!=0){
         rem=n/10;
         rev=rev*10+rem;
         n=n%10;
        }
         System.out.println(rev);
    }
}