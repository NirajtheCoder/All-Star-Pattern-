import java.util.Scanner;

public class Reverce_No {
    public static void main(String[] args) {
      Scanner ss=new Scanner(System.in);
      System.out.println("Enter the number");
    
      int n=ss.nextInt(),rev=0,rem;
      while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
      }
      System.out.println(rev);
    }
}
