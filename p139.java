import java.util.*;
class p139{
  public static void main(String args[]){  
    int a,n,sum=0,x;
    Scanner d1=new Scanner(System.in);
    n=d1.nextInt();
    a=1;
    x=n;
     do{
        if(n%a==0){
          sum=sum+a;
        }
        a++;

     }while(a<n);
      if(sum==x)
          System.out.println("the no is perfect");
      else
          System.out.println("the no is not perfect");
   }
}