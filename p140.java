import java.util.*;
class p140{
   public static void main(String args[]){
      int a,b,gcd=1,n;
      Scanner d1=new Scanner(System.in);
      a=d1.nextInt();
      b=d1.nextInt();
      n=2;
      do{
         if(a%n==0 && b%a==0){
         gcd=n;
         }
         n++;
      }while(n<=a);
       System.out.println("The GCD is :"+gcd);
   }


}