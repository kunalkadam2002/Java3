import java.util.*;
class p134{
   public static void main(String args[]){
      int n,a,fact;
      Scanner d1=new Scanner(System.in);
      n=d1.nextInt();
      a=1;
      fact=1;
      do{
        fact=fact*a;
        a++;
     }while(a<=n);
     System.out.println("factorial is :"+fact);
   }
}