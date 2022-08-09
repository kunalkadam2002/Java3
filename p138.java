import java.util.*;
class p138{
  public static void main(String args[]){
   int n,a,b;
   Scanner d1=new Scanner(System.in);
   n=d1.nextInt();
   a=2;
   do{
        if(n%a==0){
         break;
        }
        a++;
    }while(a<=n);
     if(a==n)
       System.out.println("the no is prime ");
     else 
       System.out.println("the no is not prime ");
  }



}