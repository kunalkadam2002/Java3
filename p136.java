import java.util.*;
class p136{
  public static void main(String args[]){
   int a,n,rev=0,x;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    x=n;
    do{
      a=n%10;
      n=n/10;
      rev=rev*10+a;
    }while(n!=0);
     if(x==rev)
         System.out.println("the no is palindrome");
      else 
         System.out.println("the no is not palindrome");

  }

}