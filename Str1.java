import java.util.Scanner;

public class Str1 {
    
  public static void main(String[] args) {
   Scanner ss=new Scanner(System.in);
   System.out.println("Enter a String");
   String s1=ss.next();
   //System.out.println(s1);
   String rev=""; 
  
   for(int i=s1.length()-1; i>=0; i--){
     rev=rev+s1.charAt(i);
   }
    if(s1.equals(rev)){
      System.out.println("Palindrome String");
    }else{
      System.out.println("Not Palindrome");
    }
     ss.close();

     }
  }

