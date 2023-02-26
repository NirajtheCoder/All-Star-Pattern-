public class Palindrome_No {
    public static void main(String[] args) {
        int n=121, rem,rev=0,temp;
        temp=n;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
          if(n==rev){
            System.out.println("palin");
          }else{
            System.out.println("not");
          }
    }
}
