import java.util.*;
class p137{
  public static void main(String args[]){
   int a,n,sum=0,x;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    a=1;
    x=n;
    do{
      a=n%10;
      n=n/10;
      sum=sum+a*a*a;
    }while(n!=0);
     if(sum==x)
         System.out.println("the no is armstrong no");
      else 
         System.out.println("the no is not armstrong no");

  }

}